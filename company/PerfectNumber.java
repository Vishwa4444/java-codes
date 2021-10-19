package com.company;

// check eneterd number is perfect number or not

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in=new  Scanner(System.in);
        System.out.println("Enter a number :");
        int n=in.nextInt();
        int sum=factors(n);
        if(n==sum){
            System.out.println("PERFECT NUMBER");//Ex: here, 6 is equal to 1+2+3 (the sum and number are same)
        }
        else
        {
            System.out.println("IMPERFECT NUMBER");//Ex: here, 5 is equal to 1+2+2 (the sum and number are different)
        }
    }
    static int factors(int n){
        int sum=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
