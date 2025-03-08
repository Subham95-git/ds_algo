package com.demo.array.pre_requisite.two_Pointer_approach.Triplet_Sum;

import java.util.Arrays;

public class Demo {
    static boolean isTripletPresent(int[] arr, int target){
        Arrays.sort(arr);
        int[] result = {};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;

            while (left<right){
                if(arr[i] + arr[left] + arr[right] == target){
                    return true;
                }
                else if(arr[i] + arr[left] + arr[right] < target)
                    left++;
                else
                    right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;

        if (isTripletPresent(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
