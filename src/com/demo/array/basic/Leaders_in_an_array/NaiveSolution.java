package com.demo.array.basic.Leaders_in_an_array;

import java.util.ArrayList;

public class NaiveSolution {
    public static ArrayList<Integer> findLeader(int[] data){
        int N = data.length;
        if(N==0)
            return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<N;i++){
            int j;
            for(j=i+1;j<N;j++){
                if(data[i]<data[j])
                    break;
            }
            if(j==N)
                result.add(data[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> result = findLeader(arr);
        if(result.isEmpty())
            System.out.println("Empty Array");
        else
            System.out.println(result);
    }
}
//O(n^2) Time and O(1) Space