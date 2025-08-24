package com.silentbutmad.algorithm.hcf;

import java.util.Scanner;

public class FindByRecursion {
    static int hcf1(int num1,int num2)
    {

        if(num1<num2)
        {
            if(num2%num1==0)
            {
                return num1;
            }
            else
            {
                return hcf1(num2%num1,num1);
            }
        }
        else {
            return hcf1(num2,num1);
        }
    }
    static int hcf2(int num1,int num2)
    {
        while(num1 != num2)
        {
            if(num1>num2)
            {
                return hcf2(num1-num2,num2);
            }else {
                return hcf2(num1,num2-num1);
            }

        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2=sc.nextInt();
        System.out.println(hcf2(num1,num2));

    }
}
