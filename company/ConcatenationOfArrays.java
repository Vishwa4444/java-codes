package com.company;
//https://leetcode.com/problems/concatenation-of-array/


import java.util.Arrays;

public class ConcatenationOfArrays {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println(Arrays.toString(getconcatenate(arr)));
    }
    public static int[] getconcatenate(int[] arr){
        int[] ans = new int[2* arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[i];
            ans[i+ arr.length]=arr[i];
        }
        return ans;

    }
}
