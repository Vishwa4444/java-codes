package com.company;
//this is applicable when we dont know if the given array is in ascending order or the descending order
public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {0,1,2,3,4,5,6};
        int[] arr = {6,5,4,3,2,1,0,0};
        int target=67;
        int ans=orderagnosticBS(arr,target);
        if(ans>=0) {
            System.out.println("Target number present at the location :" + "[" + ans + "]");
        }
        else
            System.out.println("Target number not present ");
    }

    static int orderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
                else
                    return mid;
            }
            else
            {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                start = mid + 1;
                }
                else
                    return mid;
            }
        }
        return -1;
    }
}
