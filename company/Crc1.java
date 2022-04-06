package com.company;

import java.util.Scanner;
import java.io.*;
public class Crc1
{
    public static void main(String[] args) {

        //input crc
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message in bits:");
        String message = sc.nextLine();
        System.out.println("Enter the generator:");
        String generator = sc.nextLine();
        int data[] = new int[message.length()+generator.length()-1];
        int divisor[] = new int[generator.length()];
        for(int i =0;i<message.length();i++)
            data[i]=Integer.parseInt(message.charAt(i)+"");
        for(int i=0;i<generator.length();i++)
            divisor[i]=Integer.parseInt(generator.charAt(i)+"");

        //cal crc
        for(int i=0;i<message.length();i++)
            if (data[i]==1)
                for(int j=0;j<divisor.length;j++)
                    data[i+j]^=divisor[j];

        //display crc
        System.out.println("the checksum code is:");
        for(int i =0;i<message.length();i++)
            data[i]=Integer.parseInt(message.charAt(i)+"");
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");

        //input checksum
        System.out.println("Enter the checksum code in bits:");
        message = sc.nextLine();
        System.out.println("Enter the generator:");
         generator = sc.nextLine();
        data = new int[message.length()+generator.length()-1];
         divisor = new int[generator.length()];
        for(int i =0;i<message.length();i++)
            data[i]=Integer.parseInt(message.charAt(i)+"");
        for(int i=0;i<generator.length();i++)
            divisor[i]=Integer.parseInt(generator.charAt(i)+"");

        //cal rem
        for(int i=0;i<message.length();i++)
            if (data[i]==1)
                for(int j=0;j<divisor.length;j++)
                    data[i+j]^=divisor[j];
        //validity
        boolean valid=true;
        for(int i=0;i<data.length;i++)
            if (data[i]==1) {
                valid = false;
                break;
            }
        if(valid==true)
            System.out.println("no error");
        else
            System.out.println(" error");



    }
}

