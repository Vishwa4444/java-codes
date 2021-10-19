package com.company;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        float a = in.nextFloat();
        float b = in.nextFloat();
        System.out.println(largest(a,b));


    }
    static float largest(float a,float b){
        if(a>b){
            System.out.print("largest number is :");
            return a;
        }
        else if(b>a){
            System.out.print("largest number is :");
            return b;
        }
        else
            System.out.print("both are equal :");
        return 0;
    }
}
