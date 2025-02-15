package com.demo.array.basic.LinearSearchAlgorithm;

public class Demo {
    public static int searchElement(int[] arr, int dataToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dataToSearch)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int dataToSearch = 31;
        int position = searchElement(arr, dataToSearch);
        if (position == -1)
            System.out.println(dataToSearch + " not present");
        else
            System.out.println(dataToSearch + " is present at index " + position);

    }
}
/*
Time Complexity:

Best Case: In the best case, the key might be present at the first index. So the best case complexity is O(1)
Worst Case: In the worst case, the key might be present at the last index i.e., opposite to the end from which the search has started in the list. So the worst-case complexity is O(N) where N is the size of the list.
Average Case: O(N)
Auxiliary Space: O(1) as except for the variable to iterate through the list, no other variable is used. */
