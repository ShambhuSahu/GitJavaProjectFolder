package com.LogicalProgramming;

import java.util.Scanner;

public class AmstrongNumber {

    Scanner sc=new Scanner(System.in);
    Integer temp=0;
    Integer rem;

Integer temp2;
    void show()
    {
        System.out.println("Enter Your Number ");
        Integer num=sc.nextInt();
         temp2=num;

        while(num!=0)
        {
         rem=num%10;
         temp=temp+(rem*rem*rem);
         num=num/10;

        }
        System.out.println(temp);
        System.out.println(temp2);

        if(temp2.equals(temp))
        {
            System.out.println(" Armstrong Number");
        }
        else
        {
            System.out.println(" Not Armstrong Number");
        }

    }

    public static void main(String[] args)
    {
        AmstrongNumber x=new AmstrongNumber();
        x.show();
    }
}
