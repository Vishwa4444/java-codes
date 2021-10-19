package com.company;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input.
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        for (int i = 0; i < 4; i++) {
            int v = in.nextInt();
            EvenOrOdd(v);
        }

    }
    static void EvenOrOdd(int v){
        if(v==0||v<0){
            System.out.println(v+" is neither EVEN nor ODD");
        }
           else if(v%2==0){
                System.out.println(v+" is EVEN");
            }
            else
                System.out.println(v+" is ODD");
    }
}
