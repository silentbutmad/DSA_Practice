package com.silentbutmad.algorithm.swapping;

public class SwapWithoutTempByAddition {
    public static void swap(int num1,  int num2)
    {
        System.out.println("Before swapping number 1 = " + num1 +", number 2 = "+ num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping number 1 = " + num1 +", number 2 = "+ num2);
    }

    public static void main(String[] args) {
        swap(10,12);
    }

}
