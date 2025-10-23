package com.neoteric;

public class FabonacciSeries {
    public static void main(String[] args) {
        int n =20;
        int a =0;
        int b =1;
        System.out.print("Fibonacci Series up to " + n + ": ");
        for(int i=0;i<n;i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
