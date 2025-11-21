package com.sujal;
//https://leetcode.com/problems/missing-number/
// Amazon Question
class MissingNumber {
    public static void main(String[] args){
        int[] arr = {3,0,1,2,5};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
    
    // cyclic sort
    int i = 0;
    while(i < nums.length){

        if(nums[i] < nums.length && nums[i] != nums[nums[i]]){
            swap(nums,i,nums[i]);
        }else{
            i++;
        }
    }

    // checking which number is missing
    for(int j = 0 ; j < nums.length ; j++){
        if(nums[j] != j ){
            return j;
        }
    }

    return nums.length;

    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second] ;
        nums[second] = temp;
    }
}