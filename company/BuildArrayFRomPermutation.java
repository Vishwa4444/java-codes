package com.company;
//https://leetcode.com/problems/build-array-from-permutation/


import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFRomPermutation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildarray()));
    }
    public static int[] buildarray(){
        int[] nums ={0,2,1,5,3,4};
        int[] ar = new int[nums.length];
        for (int i = 0; i <nums.length; i++) {
            ar[i]=nums[nums[i]];
        }
        return ar;
    }
}
