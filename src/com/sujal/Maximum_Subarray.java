package com.sujal;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] num = {2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }


        public static int maxSubArray(int[] nums) {
            int current_sum  = 0;
            int maximum_sum = Integer.MIN_VALUE;

            for(int i = 0 ; i < nums.length; i++ ) {
                current_sum = current_sum + nums[i];
                if(current_sum > maximum_sum) {
                    maximum_sum = current_sum;
                }

                if (current_sum < 0) {
                    current_sum = 0;
                }
            }

            return maximum_sum;
        }
    }

