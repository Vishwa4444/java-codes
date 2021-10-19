package com.company;

import java.util.Scanner;
//factorial by recursion method
public class Factorial {
    static int fact(int n){
        if(n==0)
            return 1;
        else
            return (n*fact(n-1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find factorial :");
        int n= in.nextInt();
        System.out.println("The factorial of "+n+" is :"+fact(n));
    }

    //factorial using loop method 2
      /*static int fact(int n){
         int fact=1;
        for (int i = 1; i < n; i++) {
            fact=fact*i;
        }
        return fact;
        }*/

}