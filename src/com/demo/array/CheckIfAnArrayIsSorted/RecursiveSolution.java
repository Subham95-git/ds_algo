package com.demo.array.CheckIfAnArrayIsSorted;

public class RecursiveSolution {
    public static boolean checkSorted(int[] data, int n){
        if(n==1 || n==0)
            return true;

        return data[n-1]>=data[n-2] && checkSorted(data, n-1);
    }

    public static void main(String[] args) {
        int[] arr = { 20, 20, 78, 98, 99, 97 };
        System.out.println(checkSorted(arr, arr.length));
    }
}
