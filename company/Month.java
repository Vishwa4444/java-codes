package com.company;

import java.util.Scanner;

//vishwa is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
public class Month {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=31;i++)
        {
            if(i%2==0){
                count++;
            }
        }
        System.out.println("The number of days he can go out in the month of August :"+count);
    }
}
