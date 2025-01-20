package com.demo.array.RemoveDuplicatesFromSortedArray;

public class BetterSolution {
    public static int removeDuplicate(int[] data){
        int n = data.length;
        if(n<=1)
            return n;
        int idx = 1;
        for(int i=1;i<n;i++){
            if(data[i]!=data[i-1]){
                data[idx++]=data[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int newLength = removeDuplicate(testArray);
        for(int i=0;i<newLength;i++){
            System.out.print(testArray[i]+ "  ");
        }
    }
}
//O(n) Time and O(1) Space