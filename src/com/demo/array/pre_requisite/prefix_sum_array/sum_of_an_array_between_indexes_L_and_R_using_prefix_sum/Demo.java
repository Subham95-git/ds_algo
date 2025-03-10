package com.demo.array.pre_requisite.prefix_sum_array.sum_of_an_array_between_indexes_L_and_R_using_prefix_sum;

public class Demo {
    static int getSum(int[] arr, int lIndex, int rIndex) {
        int sum = 0;
        for (int i = lIndex; i <= rIndex; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(getSum(arr, 1, 3));
    }
}
