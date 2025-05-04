package com.silentbutmad.algorithm.primenumber;

import java.util.Scanner;

public class FindByLoop {
    static boolean isPrime(int num)
    {
        for(int i=2;i<num;i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }


}
