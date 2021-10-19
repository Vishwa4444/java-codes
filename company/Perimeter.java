package com.company;
/*
Perimeter Of Circle
Perimeter Of Equilateral Triangle
Perimeter Of Parallelogram
Perimeter Of Rectangle
Perimeter Of Square
Perimeter Of Rhombus
 */

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        System.out.println("CIRCLE");
        System.out.println("perimeter of circle :" + circle());
        System.out.println("EQUILATERAL TRIANGLE");
        System.out.println("perimeter of Equilateral triangle :" + EquilateralTriangle());
        System.out.println("PARALLELOGRAM");
        System.out.println("perimeter of parallelogram :" + parallelogram());
        System.out.println("RECTANGLE");
        System.out.println("perimeter of rectangle :"+rectangle());
        System.out.println("SQUARE");
        System.out.println("perimeter of square :"+square());
        System.out.println("RHOMBUS");
        System.out.println("perimeter of rhombus :"+rhombus());


    }

    static double circle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius :");
        double r = in.nextDouble();
        return 2 * 3.142 * r;

    }

    static double EquilateralTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a side :");
        double side = in.nextDouble();
        return 3 * side;
    }

    static double parallelogram() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and breadth :");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double v = a + b;
        return 2 * v;

    }

    static double rectangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and breadth :");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double v = a + b;
        return 2 * v;
    }
    static double square() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a side :");
        double side = in.nextDouble();
        return 4 * side;
    }
    static double rhombus() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a side :");
        double side = in.nextDouble();
        return 4 * side;
    }
}
