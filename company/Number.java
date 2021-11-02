package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        int[] array=new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]= in.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
        System.out.print("]");
        System.out.println(Arrays.toString(array));
    }
}
