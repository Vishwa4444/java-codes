package com.company;

import java.util.Scanner;

//Input a number and print all the factors of that number positive , negative or both (use loops)

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre a number to find the factors :");
        int n = in.nextInt();
        if(n>0)
        {
            //prints positive numbers
            FactorsOfpositive(n);
        }
        else
            //prints both positive and negative numbers
        FactorsofNegative(n);
    }
   //prints only positive factors
   static void FactorsOfpositive(int n) {
        if (n == 0) {
            System.out.print("NO factors");
        } else
            System.out.print("The factors of " + n + " are :");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
   //prints both positive and negative
    static void FactorsofNegative(int n) {
        System.out.print("The factors of " + n + " are :");
        for (int i = n; i <=Math.abs(n); i++) {
            if (i == 0) {
                continue;
            }
            else
                if (n % i == 0) {
                    System.out.print(i + ", ");
                }
            }
        }
    }
