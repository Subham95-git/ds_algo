package com.demo.array.basic.RotateAnArrayClockwiseOrRight;

import java.util.Arrays;

public class RotateOneByOne {
    public static int[] rotateArray(int[] data, int numOfRotation){
        int count=0;
        while (count < numOfRotation) {
            int N = data.length;
            int lastElement = data[N - 1];
            for (int i = N - 1; i > 0; i--) {
                data[i] = data[i - 1];
            }
            data[0] = lastElement;
            count++;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        int numOfRotation = 4;
        int[] result = rotateArray(data, numOfRotation);
        Arrays.stream(result).forEach(e-> System.out.print(e + " "));
    }
}
//time O(n*d) space O(1)