package com.company;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int ans=(int)Math.sqrt(n);
        System.out.println(ans);
    }
}
