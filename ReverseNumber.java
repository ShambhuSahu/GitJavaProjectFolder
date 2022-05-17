package com.LogicalProgramming;

import java.util.Scanner;

public class ReverseNumber {

    Scanner sc=new Scanner(System.in);

    int num;
    int rev;
    int temp;

    public void reverse()
    {
        System.out.println("enter your Number ");
        num=sc.nextInt();

        while(num!=0)
        {
            rev=num%10;
            temp=temp*10+rev;
            num=num/10;

        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        ReverseNumber x=new  ReverseNumber();

        x.reverse();;
    }
}
