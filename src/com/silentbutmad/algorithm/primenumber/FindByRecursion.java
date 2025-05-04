package com.silentbutmad.algorithm.primenumber;

import java.util.Scanner;

public class FindByRecursion {
    static boolean isPrime(int num , int i)
    {
        if(i == 1)
            return true;
        else if (num % i == 0)
            return false;
        else
            return isPrime(num,--i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number");
        int num = sc.nextInt();
        System.out.println(isPrime(num,num/2));
    }
}
