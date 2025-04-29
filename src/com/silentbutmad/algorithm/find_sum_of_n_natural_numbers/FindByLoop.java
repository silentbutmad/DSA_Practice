package com.silentbutmad.algorithm.find_sum_of_n_natural_numbers;

import java.util.Scanner;

public class FindByLoop {

    static int sum(int num)
    {
        int sum = 0;
        for(int i=1;i<=num;i++)
        {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}
