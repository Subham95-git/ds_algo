Given two arrays arr1[0…m-1] and arr2[0..n-1], and a number x, the
task is to find the pair arr1[i] + arr2[j] such that absolute value
of (arr1[i] + arr2[j] – x) is minimum.

Example:

Input:  arr1[] = {1, 4, 5, 7};
            arr2[] = {10, 20, 30, 40};
            x = 32
Output:  1 and 30
Input:  arr1[] = {1, 4, 5, 7};
            arr2[] = {10, 20, 30, 40};
            x = 50
Output:  7 and 40

Can we do it in a single pass and O(1) extra space?
The idea is to start from left side of one array and right side of another
array, and use the algorithm same as step 2 of above approach.

Step-by-step approach:

Initialize a variable diff as infinite (Diff is used to store the difference
between pair and x). We need to find the minimum diff.
Initialize two index variables l and r in the given sorted array.
(a) Initialize first to the leftmost index in ar1: l = 0
(b) Initialize second the rightmost index in ar2: r = n-1
Loop while l< length.ar1 and r>=0
(a) If abs(ar1[l] + ar2[r] – sum) < diff then update diff and result
(b) If (ar1[l] + ar2[r] < sum ) then l++
(c) Else r–
Print the result.