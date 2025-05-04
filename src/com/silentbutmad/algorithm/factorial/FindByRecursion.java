package com.silentbutmad.algorithm.factorial;

import java.util.Scanner;

public class FindByRecursion {

    static int factorial(int num)
    {
        if(num==1)
            return 1;
        else
            return num * factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
}
