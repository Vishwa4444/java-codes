package com.company;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.

public class LargestNoUntillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int largest = Integer.MIN_VALUE;
        while (true) {
            int n = in.nextInt();
            if(n>largest)
                largest=n;
            if (n == 0)
                break;
        }
        System.out.println("largest number is :"+largest);
    }
}
