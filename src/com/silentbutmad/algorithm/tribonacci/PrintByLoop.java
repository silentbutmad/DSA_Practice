package com.silentbutmad.algorithm.fibonacci;

import java.util.Scanner;

public class PrintByLoop {
    static void print(int num)
    {
        int num1=0;
        int num2=1;
        int sum=1;
        System.out.print(num1 + ", " );
        for(int i=0;i<num;i++)
        {
            System.out.print(sum + ", " );
            sum=num1+num2;
            num1=num2;
            num2=sum;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        print(num);
    }
}
