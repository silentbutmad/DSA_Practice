package com.silentbutmad.algorithm.lcm;

import java.util.Scanner;

public class FindByRecursion {
    static int com=1;
    static int lcm(int num1,int num2)
    {
        if(com%num1==0 && com%num2==0)
        {
            return com;
        }
        com++;
        lcm(num1,num2);
        return com;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2=sc.nextInt();
        System.out.println(lcm(num1,num2));

    }

}
