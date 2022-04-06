package com.company;


import java.util.Scanner;
import java.io.*;
public class LeakyBucket1 {
    int n,d,nsec,x[],drop;

    LeakyBucket1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bucket size:");
        n = sc.nextInt();
        System.out.println("Enter the output rate:");
        d = sc.nextInt();
        System.out.println("Enter the no of seconds:");
        nsec = sc.nextInt();
        x= new int[nsec];
        for(int i=0;i<nsec;i++)
        {
            System.out.println("Enter the input rate "+(i+1)+"seconds");
            x[i]= sc.nextInt();
        }
    }
    void leakybucket()
    {
        drop=0;
        int i,u=n;
            for (i = 0; i < nsec; i++)
            {
                if (x[i] > u) {
                    drop = x[i]-u;
                    u = d;
                } else {
                    drop = 0;
                    u = u - x[i] + d;
                }
                 System.out.println((i + 1) + "\t\t" + x[i] + "\t\t" + d + "\t\t" + (n-u) + "\t\t" + drop);
        }
        while (u+d<=n)
        {
            drop=0;
            u=u+d;
            System.out.println((i+1)+"\t\t"+"0"+"\t\t"+d+"\t\t"+(n-u)+"\t\t"+drop);
            i++;
        }
        if(u!=n)
            System.out.println((i+1)+"\t\t"+x[i]+"\t\t"+(n-u)+"\t\t"+"0"+"\t\t"+drop);

    }

    public static void main(String[] args) {
        LeakyBucket1 l=new LeakyBucket1();
        System.out.println("Time"+"\t"+"P_recv"+"\t"+"P_sent"+"\t"+"P_left"+"\t"+"P_dropped");
        l.leakybucket();
    }
}