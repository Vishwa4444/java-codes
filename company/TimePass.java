package com.company;

public class TimePass {
    public static void main(String[] args) {
        for (int i = 0; i<= 10; i++) {
            int j=0;
            for ( j =j%3; j <=i; j++) {
                System.out.print("*");
                System.out.print("$ ");

            }
            System.out.println("");

        }
    }
}