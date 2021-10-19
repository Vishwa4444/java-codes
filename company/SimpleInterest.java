package com.company;

import java.util.Scanner;

//Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principle amount:");
        float p = in.nextFloat();
        System.out.println("Enter the no of years:");
        float t = in.nextFloat();
        System.out.println("Enter the rate :");
        float r = in.nextFloat();
        float si = si(p, t, r);
        System.out.println("simple interest :" + si);
    }
    static float si(float p, float t, float r) {
        float si = (p * t * r) / 100;
    return si;
    }
}