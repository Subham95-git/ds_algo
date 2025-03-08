package com.demo.array.pre_requisite.selection_sort;

public class SelectionSort {
    public static void sort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            int min_index = i;
            for(int j=i+1; j<len;j++){
                if(arr[min_index]>arr[j])
                    min_index = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    static void printArray(int[] arr){
        for (int element: arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Before sorting...");
        printArray(arr);

        System.out.println("After sorting...");
        sort(arr);
        printArray(arr);
    }
}
//Time Complexity: O(n2) ,as there are two nested loops
//Auxiliary Space: O(1) as the only extra memory used is for temporary variables.