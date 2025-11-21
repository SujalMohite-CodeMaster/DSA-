package com.sujal;

import java.util.ArrayList;
import java.util.List;



class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != nums[nums[i] - 1]) {
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            }
        }

        // checking the position of item at their correct index
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                ans.add(j + 1);
            }
        }
        return ans;
    }
    static  void swap(int[] nums, int first , int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}