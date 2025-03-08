package com.demo.array.basic.LargestElementInAnArray;

public class RecursiveSolution {
    public static int findMax(int index, int[] arr){
        if(index == arr.length-1)
            return arr[index];

        int returnMax = findMax(index + 1, arr);
        return Math.max(returnMax, arr[index]);
    }

    public static int getMaxElement(int[] arr){
        return findMax(0, arr);
    }

    public static void main(String[] args) {
        int[] data = {202, 10, 66, 30, 999, 132};
        System.out.println("Largest element: " + getMaxElement(data));
    }
}
//Recursive Approach – O(n) Time and O(n) Space