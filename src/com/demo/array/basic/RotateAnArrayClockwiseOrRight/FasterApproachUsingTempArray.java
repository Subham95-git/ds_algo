package com.demo.array.basic.RotateAnArrayClockwiseOrRight;

import java.util.Arrays;

public class FasterApproachUsingTempArray {
    public static int[] rotateArray(int[] data, int numOfRotation){
        int N = data.length;
        int[] tempArr = new int[N];
        numOfRotation%=N;
        int count = 0;
        for(int i=N-numOfRotation; i<N; i++){
            tempArr[count] = data[i];
            count++;
        }

        for(int i= 0; i<N-numOfRotation; i++){
            tempArr[count] = data[i];
            count++;
        }

        for(int i=0;i<N;i++){
            data[i] = tempArr[i];
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
//O(n) time complexity O(n) space complexity