package com.company;

import java.util.*;
public class DV {
    int n,adj[][],p[],d[],next_hop[];
    int src;

    final int MAX_VALUE=999;

    DV()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        n=s.nextInt();
        adj=new int[n+1][n+1];
        System.out.println("Enter the adjacency matrix:");
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
            {
                adj[i][j]=s.nextInt();
                if(i!=j && adj[i][j]==0)
                    adj[i][j]=MAX_VALUE;
            }
        System.out.println("Enter the source:");
        src=s.nextInt();
    }

    void shortpath()
    {
        d=new int[n+1];
        next_hop=new int[n+1];
        p=new int[n+1];
        for(int i=1;i<=n;i++)  {
            next_hop[i]=-1;
            d[i]=MAX_VALUE;
        }
        d[src]=0;
        next_hop[src]=src;
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
            System.out.println("Distance of "+src +" from "+v +" = "+d[v]+"\t" +next_hop[v]);
    }

    int path(int v)
    {
        while(p[v]!=src)
            v=p[v];
        return v;
    }
    public static void main(String args[]) {
        DV dv=new DV();
        dv.shortpath();
    }
}
