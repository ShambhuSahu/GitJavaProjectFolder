package com.LogicalProgramming;

import java.util.Scanner;

public class FactorialNumber {

    Scanner sc=new Scanner(System.in);
    int num;

    void factorialNumber()
    {
        System.out.println("Enter your Number ");
        num=sc.nextInt();

        for(int i=num;i>=1;i--)
        {
            System.out.print("*" +i);
        }
    }

    public static void main(String[] args) {

        FactorialNumber x=new FactorialNumber();

        x.factorialNumber();
    }
}
