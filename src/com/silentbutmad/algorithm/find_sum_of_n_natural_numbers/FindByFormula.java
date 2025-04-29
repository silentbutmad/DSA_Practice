package com.silentbutmad.algorithm.find_sum_of_n_natural_numbers;

import java.util.Scanner;

public class FindByFormula {
    static int sum(int num)
    {
        return (num*(num+1))/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }

}
