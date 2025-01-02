package com.demo.array.Alternate_elements_of_an_array;

public class Recursive_Solution {
    public static void printAlternateElement(int[] arrToPrint, int index){
        if(index< arrToPrint.length){
            System.out.println(arrToPrint[index]);
            printAlternateElement(arrToPrint, index+2);
        }
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80};
        printAlternateElement(data, 0);
    }
}
/*
Time Complexity: O(n), where n is the number of elements in arr[].
Auxiliary Space: O(n), for recursive call stack.*/