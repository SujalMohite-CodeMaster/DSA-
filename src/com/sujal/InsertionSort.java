package com.sujal;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,45,4,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] arr){
        // outerloop to iterate on array.
        for (int i = 0; i <= arr.length - 2 ; i++) {

            // inner for loop to check and swapping
            for (int j = i + 1 ; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    SelectionSort.swapping(arr,j,j-1);
                }else {
                    break;
                }
            }

        }
    }

}
