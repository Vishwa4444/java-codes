package com.company;

//Fibonacci Series In Java Programs

import java.util.Scanner;

//method 1 , which takes lot of time and space, recursion
/*public class FibonacciSeries{
    static  int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a  number to find nth fibonnaci number :");
        int n= in.nextInt();
       // for (int i = 0; i < n; i++) {
            System.out.print(fib(i)+" ");
        //}
    }
}
*/
// method 2 Dynamic programming

public class FibonacciSeries{
    static int fib(int n){
        int[] f = new int[n+2];
        f[0]=0;
        f[1]=1;
        for (int j = 2; j<= n; j++) {
            f[j]=f[j-1]+f[j-2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i)+", ");
        }
    }
}