package com.company;

import java.util.Scanner;
//Input currency in rupees and output in USD.
public class IndCurrencyUsd {
    public static void main(String[] args) {
        System.out.println("Currency in USD :"+IndToUsd());
        System.out.println("Currency in Rs :"+UsdToInd());
    }
    static float IndToUsd(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the indian currency :");
        float c = in.nextFloat();
        return c*0.014f;
    }
    static float UsdToInd(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the usd currency :");
        float c = in.nextFloat();
        return c/0.014f;
    }
}
