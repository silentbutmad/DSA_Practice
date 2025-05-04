package com.silentbutmad.algorithm.tribonacci;

import java.util.Scanner;

public class PrintByRecursion {
    static void print(int num,int num1,int num2,int num3)
    {
       if(num==0) {
           return;
       }
       int sum=num1 + num2 + num3;
       System.out.print(sum + ", ");
       print(num-1,num2,num3,sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.print("0, 1, 2, ");
        print(num - 3, 0, 1,2);
    }
}
