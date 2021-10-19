package com.company;

import java.util.Scanner;

/*      Volume Of Cone
        Volume Of Prism
        Volume Of Cylinder
        Volume Of Sphere
        Volume Of Pyramid*/
public class Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for volume of Cone");
        System.out.println("Enter 2 for Volume Of Prism");
        System.out.println("Enter 3 for Volume of Cylinder");
        System.out.println("Enter 4 for Volume of Sphere");
        System.out.println("Enter 5 for Volume of Pyramid");
        System.out.print(":-");
        int n = in.nextInt();
        System.out.println( volumeof(n));
    }
    static double volumeof(int n){
        switch (n) {
            case 1:
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the radius and height:");
                int radius = in.nextInt();
                int height = in.nextInt();
                System.out.print("volume of Cone :");
                return  (3.142 * Math.pow(radius, 2) * height) / 3;
            case 2:
                Scanner ni = new Scanner(System.in);
                System.out.println("Enter length,width,height :");
                int l = ni.nextInt();
                int w = ni.nextInt();
                int h = ni.nextInt();
                System.out.print("Volume of Square prism :");
                return l*w*h;
        }
        return -1;
    }
}
