//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class FindArea {
    public FindArea() {
    }

    public static void main(String[] args) {
        System.out.println("CIRLCLE");
        System.out.println("Area of circle : " + circle());
        System.out.println("TRIANGLE");
        System.out.println("Area of triangle :" + triangle());
        System.out.println("RECTANGLE");
        System.out.println("Area of rectangle :" + rectangle());
        System.out.println("PARALLELOGRAM");
        System.out.println("Area of parallelogram :" + parallelogram());
        System.out.println("RHOMBUS");
        System.out.println("Area of rhombus :" + rhombus());
        System.out.println("EQUILATERAL TRIANGLE");
        System.out.println("Area of Equilateral triangle :" + EquilateralTriangle());
    }

    static double rectangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and breadth :");
        double l = in.nextDouble();
        double b = in.nextDouble();
        return l * b;
    }

    static double circle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double a = in.nextDouble();
        return 3.142D * Math.pow(a, 2.0D);
    }

    static double triangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        double l = in.nextDouble();
        double b = in.nextDouble();
        return l * b / 2.0D;
    }

    static double isosceles() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        double l = in.nextDouble();
        double b = in.nextDouble();
        return l * b / 2.0D;
    }

    static double parallelogram() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height and base :");
        double h = in.nextDouble();
        double b = in.nextDouble();
        return h * b;
    }

    static double rhombus() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of two diagonals: ");
        double d1 = in.nextDouble();
        double d2 = in.nextDouble();
        return d1 * d2 / 2.0D;
    }

    static double EquilateralTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side :");
        double a = in.nextDouble();
        return Math.sqrt(3.0D) * Math.pow(a, 2.0D) / 4.0D;
    }
}
