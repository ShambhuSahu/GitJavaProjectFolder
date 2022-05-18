package com.LogicalProgramming;

import java.util.Scanner;

public class EvenOddProgramm {

    Scanner sc=new Scanner(System.in);

    public void show()
    {
        System.out.println("Enter your Number ");
        Integer number=sc.nextInt();
        if(number>0)
        {
            if (number % 2 == 0) {
                System.out.println("This Even Number ");
            } else {
                System.out.println("This is Odd Number ");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args)
    {
        EvenOddProgramm x=new EvenOddProgramm();
        x.show();
    }

}
