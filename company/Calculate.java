package com.company;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter +,-,*,/,% :");
        char ch=in.next().trim().charAt(0);
        if(ch=='+'){
            System.out.println("Enter two numbers to add:");
            int a= in.nextInt();
            int b= in.nextInt();
            int c=a+b;
            System.out.println("ans:"+c);
        }
        if(ch=='-'){
            System.out.println("Enter two numbers to subtract:");
            int a= in.nextInt();
            int b= in.nextInt();
            int c=a-b;
            System.out.println("ans:"+c);
        }
        if(ch=='*'){
            System.out.println("Enter two numbers to multiply:");
            int a= in.nextInt();
            int b= in.nextInt();
            int c=a*b;
            System.out.println("ans:"+c);
        }
        if(ch=='/'){
            System.out.println("Enter two numbers to divide:");
            int a= in.nextInt();
            int b= in.nextInt();
            int c=a/b;
            System.out.println("ans:"+c);
        }
        if(ch=='%'){
            System.out.println("Enter two numbers for modulo:");
            int a= in.nextInt();
            int b= in.nextInt();
            int c=a%b;
            System.out.println("ans:"+c);
        }



         }
}
