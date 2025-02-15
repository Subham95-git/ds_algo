package com.demo.array.basic.Alternate_elements_of_an_array;

public class Iterative_Solution {

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80};
        printAlternateElement(data);
    }

    public static void printAlternateElement(int[] arrayToPrint){
        for (int i=0; i<arrayToPrint.length; i+=2){
            System.out.println(arrayToPrint[i]);
        }
    }

}
/*
Time Complexity: O(n), where n is the number of elements in arr[].
Auxiliary Space: O(1)*/