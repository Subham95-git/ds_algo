package com.demo.array.LargestElementInAnArray;

public class IterativeSolution {
    public static int findLargest(int[] arr){
        if(arr.length == 0)
            return -1;
        int largestElement = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largestElement)
                largestElement = arr[i];
        }
        return largestElement;
    }

    public static void main(String[] args) {
        int[] data = {202, 10, 66, 30, 999, 132};
        int largestElement = findLargest(data);
        if (largestElement == -1)
            System.out.println("Empty Array");
        else
            System.out.println("The largest element: " + largestElement);
    }
}
//Iterative Approach – O(n) Time and O(1) Space