package com.company;
//https://leetcode.com/problems/running-sum-of-1d-array/


import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningsum(nums)));
    }
    public static int[] runningsum(int[] nums){
        for (int i = 1; i < nums.length; i++) {
          nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
