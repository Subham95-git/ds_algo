package com.demo.array.pre_requisite.two_Pointer_approach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointerDemo {
    public static boolean getTwoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target)
                left++;
            else if (sum > target)
                right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;
        boolean ifPresent = getTwoSum(arr, target);
        if(!ifPresent)
            System.out.println("Not present");
        else
            System.out.println("Present");
    }
}
