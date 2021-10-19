package com.company;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers

public class SumUntillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers :");
        int sum =0;
       while(true) {
           int n = in.nextInt();
           sum = sum + n;
           if (n == 0)
               break;
       }
           System.out.print("The sum is :" + sum);
    }
}
