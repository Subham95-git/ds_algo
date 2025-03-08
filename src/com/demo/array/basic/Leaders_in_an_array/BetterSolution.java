package com.demo.array.basic.Leaders_in_an_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetterSolution {
    public static ArrayList<Integer> findLeader(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        if(n==0)
            return result;
        int maxRight = arr[n-1];
        result.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxRight){
                maxRight = arr[i];
                result.add(maxRight);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        List<Integer> result = findLeader(arr);
        Collections.reverse(result);
        result.forEach(System.out::println);
    }
}
