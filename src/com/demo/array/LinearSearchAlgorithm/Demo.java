package com.demo.array.LinearSearchAlgorithm;

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
