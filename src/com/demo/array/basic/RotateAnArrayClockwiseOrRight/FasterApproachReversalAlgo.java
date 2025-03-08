package com.demo.array.basic.RotateAnArrayClockwiseOrRight;

import java.util.Arrays;

/*
The idea is based on the observation that if we right
rotate the array by d positions, the last d elements will be
in the front and first (n – d) elements will be at the end.

First reverse all the elements of the array.
Then reverse first d elements.
Finally, reverse last (n – d) elements to get the final rotated array.*/
public class FasterApproachReversalAlgo {
    public static int[] rotateArray(int[] data, int numOfRotation){
        int N = data.length;
        numOfRotation %= N;

        rotate( data, 0, N-1);

        rotate(data, 0, numOfRotation-1);

        rotate(data, numOfRotation, N-1);

        return data;
    }

    public static void rotate(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        int numOfRotation = 4;
        int[] result = rotateArray(data, numOfRotation);
        Arrays.stream(result).forEach(e-> System.out.print(e + " "));
    }
}
