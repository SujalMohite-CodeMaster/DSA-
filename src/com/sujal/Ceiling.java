package com.sujal;

// Ceiling = Smallest element in the array which is greater or equal to target element ;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -5, 0, 3, 6, 12, 24, 67};
        int target = -4;

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // ans
            }

        }
        return start;
    }
}
