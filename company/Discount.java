package com.company;

import java.util.Scanner;
//calculate the discount
public class Discount {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the price of the item and discount :");
        double price= in.nextDouble();
     double discount= in.nextDouble();
        System.out.println("price after discount is :"+discount(price,discount));

    }
    static double discount(double p,double d){
        double ans= p-(p*d*0.01);
        return ans;
    }
}
