package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Object1 {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a= in.nextInt();
        int b= in.nextInt();
       int ans= add(a,b);
        System.out.println("sum :"+ans);
    }
    public static int  add(int x,int y){
        return x+y;
    }
}
