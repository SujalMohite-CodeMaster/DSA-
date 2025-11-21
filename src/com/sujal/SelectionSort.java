package com.sujal;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        // find the max item in the remaining array and swapped with the correct index.
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swapping(arr,maxIndex,last);
        }
    }

    // swapping
    static void swapping(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr , int start , int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
