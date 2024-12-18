package com.demo.array;

import java.sql.Array;
import java.util.Arrays;

public class InsertionToAIndex {
    public void insertElementByIndex(int[] arr, int element, int length, int index){
        for(int i = length-1; i>=index; i--)
            arr[i+1] = arr[i];
        arr[index] = element;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        Arrays.stream(arr).forEach(e-> System.out.print(e + ", "));
        InsertionToAIndex insertionToAIndex = new InsertionToAIndex();
        System.out.println();
        insertionToAIndex.insertElementByIndex(arr, 10, arr.length-1, 2);
        Arrays.stream(arr).forEach(e-> System.out.print(e + ", "));
    }
}
