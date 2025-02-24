Two pointers is really an easy and effective technique that is
typically used for Two Sum in Sorted Arrays, Closest Two Sum,
Three Sum, Four Sum, Trapping Rain Water and many other popular interview questions.
Given a sorted array arr (sorted in ascending order) and a target, find if
there exists any pair of elements (arr[i], arr[j]) such that their sum is equal to the target.

Illustration :

Input: arr[] = {10, 20, 35, 50}, target =70
Output:  Yes
Explanation : There is a pair (20, 50) with given target.


Input: arr[] = {10, 20, 30}, target =70
Output :  No
Explanation : There is no pair with sum 70


Input: arr[] = {-8, 1, 4, 6, 10, 45], target = 16
Output: Yes
Explanation : There is a pair (6, 10) with given target.


Naive Method – O(n^2) Time and O(1) Space
Two-Pointer Technique – O(n) time and O(1) space
How does this work?
More problems based on two pointer technique.
Naive Method – O(n^2) Time and O(1) Space
The very basic approach is to generate all the possible pairs and check if any of them add up to the target value. To generate all pairs, we simply run two nested loops.




class GfG {

    // Function to check whether any pair exists
    // whose sum is equal to the given target value
    static boolean twoSum(int[] arr, int target){
        int n = arr.length;

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // For each element arr[i], check every
            // other element arr[j] that comes after it
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the current pair
                // equals the target
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        // If no pair is found after checking
        // all possibilities
        return false;
    }

    public static void main(String[] args){

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        // Call the twoSum function and print the result
        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

Output
true
Better Approaches – Binary Search and Hashing
We can use more methods like Binary Search and Hashing to solve
 this problem (Please refer Two Sum article for details) in better
 time complexity but Two Pointer Technique is the best solution for
 this problem that works well for sorted arrays.

Two-Pointer Technique – O(n) time and O(1) space
The idea of this technique is to begin with two corners of the
given array. We use two index variables left and right to traverse from both corners.

Initialize: left = 0, right = n – 1
Run a loop while left < right, do the following inside the loop

Compute current sum, sum = arr[left] + arr[right]
If the sum equals the target, we’ve found the pair.
If the sum is less than the target, move the left pointer to the right to increase the sum.
If the sum is greater than the target, move the right pointer to the left to decrease the sum.

Time Complexity: O(n) as the loops runs at most n times. We
either increase left, or decrease right or stop the loop.
Auxiliary Space: O(1)

How does this work?
We need to prove that we never miss a valid pair.

Case 1 ( When we increment left ) In this case we simply ignore
current arr[left] and move to the next element by doing left++.
We do this when arr[left] + arr[right] is smaller than the target.
The reason this step is safe is, if arr[left] is giving a smaller value
than sum, then it will given even much less values for the elements before
arr[right]. Now how about the elements after arr[right]? Note that we moved
right when we were sure that no pair can be formed with the current right
(arr[right] was too high), so arr[left] can not form a pair with those values also.

Case 2 (When we decrement right) We can use the same reasoning (as we discussed for left)
to prove that we never miss out a valid pair.

