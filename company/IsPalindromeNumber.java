package com.company;

import java.util.Scanner;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=in.nextInt();
       int rev= palindrome(n);
        if(n==rev)
            System.out.println("its a palindrome");
        else
            System.out.println("its not  a palindrome");
    }
    static int palindrome(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
}
