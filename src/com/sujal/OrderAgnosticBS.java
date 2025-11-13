package com.sujal;

public class OrderAgnosticBS {
        public static void main(String[] args) {
            int[] arr = { -18,-12,-5,0,3,6,12,24,67};
            int target = 4;

            int ans = orderAgnosticBS(arr,target);
            System.out.println(ans);
        }

        static int orderAgnosticBS(int[] arr,int target){
            int start = 0;
            int end = arr.length - 1;

            // to check whether the array is ascending or descending order .
            boolean isAsc = arr[start] < arr[end];

            while(start <= end){

                int mid = start + (end - start)/2;

                if (arr[mid] == target){
                    return mid;
                }

                if (isAsc){
                    if (target < arr[mid]){
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }else {
                    if (target > arr[mid]){
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }

            }
            return -1;
        }
    }


