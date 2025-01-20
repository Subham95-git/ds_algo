package com.demo.array.Largest_element_in_an_Array;

public class RecursiveSolution {
    public static int findMax(int[] arr, int index){
        if(arr.length == 0)
            return 0;
        if(index == arr.length-1)
            return arr[index];
        int recMax = findMax(arr, index+1);
        return Math.max(recMax, arr[index]);
    }

    public static void main(String[] args) {
        int[] dataArray = {10, 30, 5, 6, 2};
        int largest = findMax(dataArray, 0);
        System.out.println("Largest element: " + largest);
    }
}
