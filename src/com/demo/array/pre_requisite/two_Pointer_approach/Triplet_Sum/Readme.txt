Conceptual Explanation of 3 Sum Problem
The 3 Sum problem involves finding all unique triplets in an array that
sum up to a given target value (usually zero). Here is a step-by-step approach
to solve this problem conceptually:


Sort the Array: Start by sorting the array. This helps in using the two-pointer
technique efficiently.


Iterate through the Array: Use a loop to iterate through the array. For each element,
treat it as the first element of the triplet.


Two-Pointer Technique: For the remaining part of the array, use two pointers. One pointer
starts just after the current element, and the other pointer starts at the end of the array.


Check Sum: Calculate the sum of the three elements (current element + element at left
pointer + element at right pointer).

If the sum is zero, you have found a triplet.
If the sum is less than zero, move the left pointer to the right to increase the sum.
If the sum is greater than zero, move the right pointer to the left to decrease the sum.

Avoid Duplicates: Ensure that the triplets are unique by skipping over duplicate elements.