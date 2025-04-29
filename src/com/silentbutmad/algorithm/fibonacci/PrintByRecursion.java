package com.silentbutmad.algorithm.fibonacci;

import java.util.Scanner;

public class PrintByRecursion {
    static void print(int num,int num1,int num2)
    {
       if(num==0) {
           return;
       }
       int sum=num1 +num2;
       System.out.print(sum + ", ");
       print(num-1,num2,sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.print("0, 1, ");
        print(num - 2, 0, 1);
    }
}
