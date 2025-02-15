package com.demo.array.basic.CheckIfAnArrayIsSorted;

public class IterativeSolution {
    public static boolean checkSorted(int[] data){
        boolean check = true;
        for(int i=0;i<data.length-1;i++){
            if(data[i]>data[i+1]){
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 20, 78, 98, 99, 97 };
        System.out.println(checkSorted(arr));
    }
}
//O(n) Time and O(1) Space