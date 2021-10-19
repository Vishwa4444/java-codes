package com.company;

import java.util.Scanner;

/* 1 to 100 units – Rs. 10/unit
        100 to 200 units – Rs. 15/unit
        200 to 300 units – Rs. 20/unit
        above 300 units – Rs. 25/unit*/
//Calculate Electricity Bill
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the units consumed :");
        double units =in.nextDouble();
        System.out.println("Totat bill amount :"+bill(units));
    }
    static double bill(double units){
        if(units<=100)
            return units*10;
        else if(units<=200)
            return 100*10+(units-100)*5;
        else if(units<=300)
            return 200*15+(units-200)*5;
        else if(units>300)
            return 300*20+(units-300)*5;
        else
            return -1;
    }
}
