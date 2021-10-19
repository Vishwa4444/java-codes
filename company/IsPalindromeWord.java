package com.company;

import java.util.Scanner;

public class IsPalindromeWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name :");
        String s=in.nextLine();
        String v= palindrome(s);
        if(v.equalsIgnoreCase(s))
            System.out.println("PALINDROME");
        else
            System.out.println("NOT PALINDROME");
    }
    static String palindrome(String s){
        String v ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            v=v+s.charAt(i);
        }
        System.out.println(v);
        return v;
    }
}
