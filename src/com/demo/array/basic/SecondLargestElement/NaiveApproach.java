package com.demo.array.basic.SecondLargestElement;

import java.util.Arrays;

public class NaiveApproach {
    public static int getSecondLargest(int[] arr){
        int N = arr.length;
        if(N==0)
            return -1;
        Arrays.sort(arr);
        for(int i=N-2;i>=0;i--){
            if(arr[i]!= arr[N-1])
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 7, 80, 52, 8};
        System.out.println(getSecondLargest(arr));
    }
}
//Time Complexity: O(n*logn)
//Auxiliary space: O(1)
