package com.demo.array.GeneratingAllSubarrays;

public class RecursiveSolution {
    public static void getSubarray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] testData = {1,2,3,4,5};
        getSubarray(testData);
    }
}
//