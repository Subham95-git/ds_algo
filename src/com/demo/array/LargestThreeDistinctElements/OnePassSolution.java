package com.demo.array.LargestThreeDistinctElements;

import java.util.ArrayList;
import java.util.List;

public class OnePassSolution {
    public static ArrayList<Integer> getLargestThree(int[] arr){
        int N = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        if(N==0)
            return result;
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for(int x : arr){
            if(x> first){
                third = second;
                second = first;
                first = x;
            } else if (x> second && x<first) {
                third = second;
                second = x;
            } else if (x>third && x< second) {
                third=x;
            }
        }
        if(first==Integer.MIN_VALUE) return result;
        result.add(first);
        if(second==Integer.MIN_VALUE) return result;
        result.add(second);
        if(third==Integer.MIN_VALUE) return result;
        result.add(third);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        List<Integer> res = getLargestThree(arr);
        for(int x: res){
            System.out.print(x+" ");
        }
    }
}
