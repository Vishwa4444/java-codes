package com.company;

import java.util.Scanner;

//Take name as input and print a greeting message for that name.
public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = in.next();
        System.out.println("hey "+ name+ " how are you ?");
    }
}
