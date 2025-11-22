package com.sujal;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.List;
import java.util.ArrayList;

public class FindAllDuplicate {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {

        // if range given 1 to n then apply cyclic sort 
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i , correct);
            }else{
                i++;
            }
        }

        // checking the wrong numbers at wrong index
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                ans.add(nums[j]);
            }
        }
        return ans;
        
    }
   static void swap(int[] nums,int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}