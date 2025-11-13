package com.sujal;

public class Max {
    public static void main(String[] args) {
        // to find the maximum element in the array
        int[] arr = {1,2,43,4,5};

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);

    }
}
