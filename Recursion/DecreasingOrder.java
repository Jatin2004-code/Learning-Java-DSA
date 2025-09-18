/**
 * This file is part of the Recursion package.
 * It is intended for demonstrating recursion concepts in Java.
 */
// package Recursion;

public class DecreasingOrder {
    public static void printdec(int n){

        // base case
        if (n == 1) {
            System.out.println(n);
            return;
        }

        // function work 
        System.out.print(n + " ");

        printdec(n - 1);   // inner function call
    }

    public static void main(String[] args) {
        int n = 10;
        printdec(n);
    }
}