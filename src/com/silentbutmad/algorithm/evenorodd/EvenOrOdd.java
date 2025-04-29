package com.silentbutmad.algorithm.evenorodd;

import java.util.Scanner;

public class EvenOrOdd {
    static String checkEvenOrOdd(int num)
    {
        return (num % 2 == 0)? "Even Number" : "Odd Number" ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        System.out.println(checkEvenOrOdd(num));
    }
}
