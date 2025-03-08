package com.demo.array.basic;

import java.util.Arrays;

public class DeleteAnElement {
    public int findIndexToDelete(int[] arr, int arrLength, int element){
        for(int i=0;i<arrLength;i++){
            if(arr[i]== element)
                return i;
        }
        return -1;
    }

    public void deleteElement(int[] arr, int arrLength, int element){
        int pos = findIndexToDelete(arr, arrLength, element);
        if(pos == -1){
            System.out.println("Element not found");
            return;
        }
        for(int i=pos; i<arrLength-1;i++)
            arr[i] = arr[i+1];
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        Arrays.stream(arr).forEach(e-> System.out.print(e + ", "));
        DeleteAnElement deleteAnElement = new DeleteAnElement();
        System.out.println();
        deleteAnElement.deleteElement(arr, arr.length,3);
        Arrays.stream(arr).forEach(e-> System.out.print(e + ", "));
    }
}
