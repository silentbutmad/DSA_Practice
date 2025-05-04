package com.silentbutmad.algorithm.factorial;

import java.util.Scanner;

public class FindByLoop {
    static int factorial(int num)
    {
        int fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
}
