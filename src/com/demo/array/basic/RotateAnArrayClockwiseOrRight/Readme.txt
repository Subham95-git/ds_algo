How to implement rotations in an array?
There are several ways to implement array rotations. Some of the approaches are mentioned below.
Here we are considering right rotation. The movements will be just the opposite for left rotation.

Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
Output: {5, 6, 1, 2, 3, 4}
Explanation: After first right rotation, arr[] becomes {6, 1, 2, 3, 4, 5} and after
the second rotation, arr[] becomes {5, 6, 1, 2, 3, 4}


Input: arr[] = {1, 2, 3}, d = 4
Output: {3, 1, 2}
Explanation: The array is rotated as follows:


After first left rotation, arr[] = {3, 1, 2}
After second left rotation, arr[] = {2, 3, 1}
After third left rotation, arr[] = {1, 2, 3}
After fourth left rotation, arr[] = {3, 1, 2}
