Trapping Rainwater Problem states that given an array of n non-negative
integers arr[] representing an elevation map where the width of each bar
is 1, compute how much water it can trap after rain.

Input: arr[] = [3, 0, 1, 0, 4, 0, 2]
Output: 10
Explanation: The expected rainwater to be trapped is shown in the above image.


Input: arr[] = [3, 0, 2, 0, 4]
Output: 7
Explanation: We trap 0 + 3 + 1 + 3 + 0 = 7 units.


Input: arr[] = [1, 2, 3, 4]
Output: 0
Explanation: We cannot trap water as there is no height bound on both sides


Input: arr[] = [2, 1, 5, 3, 1, 0, 4]
Output: 9
Explanation : We trap 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units of water.

The basic intuition of the problem is as follows:

1. An element of the array can store water if there are higher bars on
   the left and the right.
2. The amount of water to be stored in every position can be found by finding
   the heights of the higher bars on the left and right sides.
3. The total amount of water stored is the summation of the water stored in each index.
4. No water can be filled if there is no boundary on both sides.

The approach is mainly based on the following facts:

1. If we consider a subarray arr[left…right], we can decide the amount of water
   either for arr[left] or arr[right] if we know the left max (max element in
   arr[0…left-1]) and right max (max element in arr[right+1…n-1].
2. If left max is less than the right max, then we can decide for arr[left]. Else
   we can decide for arr[right]
3. If we decide for arr[left], then the amount of water would be left max – arr[left]
   and if we decide for arr[right], then the amount of water would be right max – arr[right].