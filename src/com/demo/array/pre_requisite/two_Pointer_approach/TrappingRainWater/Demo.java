package com.demo.array.pre_requisite.two_Pointer_approach.TrappingRainWater;

public class Demo {
    static int calculateWater(int[] data){
        int leftIndex = 1;
        int rightIndex = data.length-2;
        int leftMax = data[leftIndex-1];
        int rightMax = data[rightIndex +1];
        int waterAmount = 0;

        while (leftIndex <= rightIndex){
            if(leftMax<rightMax){
                waterAmount += Math.max(0, leftMax-data[leftIndex]);
                leftMax = Math.max(leftMax,data[leftIndex]);
                leftIndex++;
            } else {
                waterAmount += Math.max(0, rightMax-data[rightIndex]);
                rightMax = Math.max(rightMax,data[rightIndex]);
                rightIndex--;
            }
        }
        return waterAmount;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(calculateWater(arr));
    }
}
