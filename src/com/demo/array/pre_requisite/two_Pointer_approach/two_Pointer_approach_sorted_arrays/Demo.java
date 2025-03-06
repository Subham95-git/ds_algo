package com.demo.array.pre_requisite.two_Pointer_approach.two_Pointer_approach_sorted_arrays;

public class Demo {
    static void getClosest(int[] arr1, int[] arr2, int target){
        int M = arr1.length, N = arr2.length, diff = Integer.MAX_VALUE;
        int res_arr1 = 0, res_arr2 = 0;
        int left = 0, right = N-1;
        while(left<M && right>=0){
            if(Math.abs(arr1[left] + arr2[right]-target) <diff){
                res_arr1 = left;
                res_arr2 = right;
                diff = Math.abs(arr1[left] + arr2[right])-target;
            }
            if(arr1[left] + arr2[right]<target)
                left++;
            else
                right--;
        }
        System.out.println("The closest pair is " + arr1[res_arr1] + " and " + arr2[res_arr2]);
    }

    public static void main(String[] args) {
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
        int target = 38;
        getClosest(ar1, ar2, target);
    }
}
