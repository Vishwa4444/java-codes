package com.company;
//binary search
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        int target=23;
        int ans=binarysearch(arr,target);
        if(ans>=0) {
            System.out.println("Target number present at the location :" + "[" + ans + "]");
        }
        else
            System.out.println("Target number not present ");
    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
