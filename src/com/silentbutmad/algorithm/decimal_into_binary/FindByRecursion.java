package com.silentbutmad.algorithm.decimal_into_binary;

import java.util.Scanner;

public class FindByRecursion {
    static int convert(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else
        {
            return (num%2+(convert(num/2)*10));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(convert(num));
    }
}
