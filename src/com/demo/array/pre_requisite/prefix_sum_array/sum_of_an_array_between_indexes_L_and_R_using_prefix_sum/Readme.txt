Given an array arr of integers of size n. We need to compute the sum of elements from
index i to index j. The queries consisting of i and j index values will be executed multiple times.

Input : arr[] = {1, 2, 3, 4, 5}
        i = 1, j = 3
        i = 2, j = 4
Output :  9
         12
Input : arr[] = {1, 2, 3, 4, 5}
        i = 0, j = 4
        i = 1, j = 2
Output : 15
          5

Follow the given steps to solve the problem:

1. Create the prefix sum array of the given input array
2. Now for every query (1-based indexing)
   If L is greater than 1, then print prefixSum[R] – prefixSum[L-1]
   else print prefixSum[R]