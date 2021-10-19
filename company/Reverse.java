package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name and number to reverse :");
         String s= in.nextLine();
        // int n=in.nextInt();
        reverse(s);
       // reverse(n);

    }
    static void reverse(String s){
        String v="";
        for (int i=s.length()-1 ; i >=0; i--) {
            v=v+s.charAt(i);
        }
        System.out.println(v);
    }
    static void reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println();
        System.out.println(rev);

    }

}