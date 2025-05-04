package com.demo.array.pre_requisite.Prefix_Sum_Array;

import java.util.Arrays;

public class Demo {
    static int[] calculatePrefixSum(int[] data){
        int N = data.length;
        if(N==0)
            return new int[0];
        int[] prefixSum = new int[N];
        prefixSum[0] =data[0];
        for(int i=1;i<N;i++){
            prefixSum[i] = data[i] + prefixSum[i-1];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 5, 15};
        int[] prefixSum = calculatePrefixSum(arr);
        System.out.println(Arrays.toString(prefixSum));
    }
}
