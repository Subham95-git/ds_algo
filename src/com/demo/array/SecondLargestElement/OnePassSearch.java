package com.demo.array.SecondLargestElement;

public class OnePassSearch {

    public static int findSecondLargest(int[] arr){
        int N = arr.length;
        if(N == 0)
            return -1;

        int largest = -1;
        int secondLargest = -1;

        for(int i=0;i<N;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 7, 80, 52, 8};
        System.out.println(findSecondLargest(arr));
    }
}
