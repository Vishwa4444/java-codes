package com.company;

import java.util.Scanner;
import java.io.*;

public class DV1
{
    int n,adj[][],src,p[],d[],next_hop[];
    final int MAXVALUE=99;

    DV1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        n= sc.nextInt();
        System.out.println("Enter the Adj matrix:");
        adj = new int[n+1][n+1];
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
            {
                adj[i][j]=sc.nextInt();
                if (i!=j && adj[i][j]==0)
                    adj[i][j]=MAXVALUE;
            }
        System.out.println("Enter the src:");
        src=sc.nextInt();
    }
    void shortpath()
    {
     p=new int[n+1];
     next_hop=new int[n+1];
     d=new int[n+1];
     for(int i =1;i<=n;i++)
     {
         next_hop[i]=-1;
         d[i]=MAXVALUE;
     }
     next_hop[src]=src;
     d[src]=0;
     for(int i=1;i<=n-1;i++)
     {
         for(int source=1;source<=n;source++)
         {
             for(int dest=1;dest<=n;dest++)
             {
                 if(d[source]+adj[source][dest]<d[dest])
                 {
                     d[dest]=d[source]+adj[source][dest];
                     p[dest]=source;
                 }
             }
         }
     }
     for(int i=1;i<=n;i++)
         if(i!=src)
             next_hop[i]=path(i);
         for(int v=1;v<=n;v++)
             System.out.println("dist of "+src+" from "+ v +"="+d[v]+" "+next_hop[v]);

    }
    int path(int v)
    {
        while (p[v]!=src)
            v=p[v];
        return v;
    }

    public static void main(String[] args) {
        DV1 dv = new DV1();
        dv.shortpath();
    }

}