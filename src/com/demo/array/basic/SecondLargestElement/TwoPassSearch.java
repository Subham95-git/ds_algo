package com.demo.array.basic.SecondLargestElement;

public class TwoPassSearch {

    public static int findSecondLargest(int[] arr){
        if(arr.length == 0)
            return -1;

        int largest = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest)
                largest = arr[i];
        }
        int secondLargest = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<largest && arr[i]>secondLargest)
                secondLargest = arr[i];
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 7, 80, 52, 8};
        System.out.println(findSecondLargest(arr));
    }
}
// O(n) Time and O(1) Space