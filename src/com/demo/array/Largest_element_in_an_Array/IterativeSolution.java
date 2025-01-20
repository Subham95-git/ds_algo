package com.demo.array.Largest_element_in_an_Array;

public class IterativeSolution {
    public static int findLargest(int[] data){
        if(data.length == 0){
            System.out.println("Empty array");
            return 0;
        }
        int largest = data[0];
        for(int i=1; i<data.length; i++){
            if(data[i]>largest)
                largest = data[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] dataArray = {10, 30, 5, 6, 2};
        int largest = findLargest(dataArray);
        System.out.println("Largest element: " + largest);
    }
}
