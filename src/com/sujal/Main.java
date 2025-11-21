package com.sujal;

import java.util.Arrays;

public class Main {
 public static void main(String[] args) {
     int[] arr = {1,2,4,5,2,4,3};
     bubble(arr);
     System.out.println(Arrays.toString(arr));
 }

 static void bubble(int[] arr) {

     boolean swapped;
     // run the steps till n-1 times
     for (int i = 0; i < arr.length; i++) {
         // run the inner loop , max come will at last respective index.
         for (int j = 1; j < arr.length - i; j++) {
             // swap the item is smaller than previous item.
             if (arr[j] < arr[j-1]) {
                 int temp = arr[j];
                 arr[j] = arr[j - 1];
                 arr[j - 1] = temp;
                 swapped = true;
             }
         }
     }

 }

}
