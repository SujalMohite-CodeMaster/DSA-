package com.sujal;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            if(arr[i] != arr[arr[i] - 1]){
                SelectionSort.swapping(arr,i,arr[i]-1);
            }else {
                i++;
            }
        }
    }
}
