package com.company;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two distances :");
        int d1= in.nextInt();
        int d2 = in.nextInt();
        if(d1>d2)
            System.out.println("not possible");
        else {
            int d = d2 - d1;
            System.out.println("Distance between two points :" + d+" meters");
        }
    }
}
