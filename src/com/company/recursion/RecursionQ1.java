package com.company.recursion;

import java.util.Scanner;

public class RecursionQ1 {
//    Print 1 to N number using recursion
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printRecursiveNumber(1,n);


    }


    public static void printRecursiveNumber(int currentValue, int n)
    {
//        Base condition
        if(currentValue==n)
        {
            System.out.println(currentValue);
            return;
        }
        System.out.println(currentValue);
        printRecursiveNumber(currentValue+1,n);
    }
}
