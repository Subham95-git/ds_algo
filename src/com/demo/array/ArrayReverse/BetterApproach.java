package com.demo.array.ArrayReverse;

import java.util.Arrays;

public class BetterApproach {
    public static void reverseArray(int[] arr){
        int n = arr.length;
        for(int i=0,j=n-1;i<n && j>=0;i++,j--){
            if(i>=j)
                break;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        System.out.println("\nActual Array ");
        Arrays.stream(data).forEach(e-> System.out.print(e+" "));
        reverseArray(data);
        System.out.println("\nReversed Array ");
        Arrays.stream(data).forEach(e-> System.out.print(e+" "));
    }
}
