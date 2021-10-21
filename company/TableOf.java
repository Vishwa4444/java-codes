package com.company;

import java.util.Scanner;

public class TableOf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Table of ?");
        int n = in.nextInt();
        MultipleOf(n);
    }
    static void MultipleOf(int n){
        System.out.println("multiple of "+n+" upto 10 are :");
        for (int i = 1; i <=10; i++) {
//            if(i%n==0){
//                System.out.println(i);
//            }
            int c=n*i;
            System.out.println(c);

        }
    }
}
