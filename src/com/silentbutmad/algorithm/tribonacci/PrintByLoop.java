package com.silentbutmad.algorithm.tribonacci;

import java.util.Scanner;

public class PrintByLoop {
    static void print(int num)
    {
        int num1=0;
        int num2=1;
        int num3=2;
        int sum=0;
        System.out.print(num1 + ", " );
        System.out.print(num2 + ", " );
        System.out.print(num3 + ", " );
        for(int i=2;i<num;i++)
        {
            sum=num1+num2+num3;
            System.out.print(sum + ", " );
            num1=num2;
            num2=num3;
            num3=sum;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        print(num);
    }
}
