package com.company;

import java.util.Scanner;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class ProductOfNosMinusSumOfNos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = in.nextInt();
        int ans = ProOfNos(n)-SumOfNos(n);
        System.out.println(ans);
    }
    static int ProOfNos(int n){
        int ans=1;
        while (n>0){
            int rem=n%10;
            ans=ans*rem;
            n/=10;
        }
        return ans;
    }
    static int SumOfNos(int n){
        int ans=0;
        while (n>0){
            int rem=n%10;
            ans=ans+rem;
            n/=10;
        }
        return ans;
    }
}
