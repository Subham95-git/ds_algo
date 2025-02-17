package com.demo.array.pre_requisite.binary_search;

public class RecursiveSolution {
    public static int searchElement(int[] arr, int elementToSearch, int start, int end){
        if(start<=end){
            int mid = start + (end -start)/2;

            if(arr[mid]== elementToSearch)
                return mid;
            else if (arr[mid]>elementToSearch)
                return searchElement(arr, elementToSearch, start, mid-1);
            else
                return searchElement(arr, elementToSearch, mid+1, end);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int elementToSearch = 40;
        int result = searchElement(arr, elementToSearch, 0, arr.length-1);
        if(result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present at position " + result);
    }
}
/*
* Time Complexity:
Best Case: O(1)
Average Case: O(log N)
Worst Case: O(log N)
Auxiliary Space: O(1),
If the recursive call stack is
considered then the auxiliary space will be O(logN)
* */