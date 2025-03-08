package com.demo.array.pre_requisite.binary_search;

public class BinarySearch {
    public static int searchElement(int[] arr, int elementToSearch){
        int start = 0, end = arr.length;
        while (start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid] == elementToSearch)
                return mid;

            else if(arr[mid]> elementToSearch)
                end = mid-1;

            else
                start = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int elementToSearch = 40;
        int result = searchElement(arr, elementToSearch);
        if(result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present at position " + result);
    }
}
//Time Complexity: O(log N)
//Auxiliary Space: O(1)