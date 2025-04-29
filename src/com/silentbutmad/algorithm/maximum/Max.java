package com.silentbutmad.algorithm.maximum;

public class Max {
    static int maxByManual(int num1,int num2)
    {
        return (num1 > num2)? num1 : num2;
    }
    static int maxByPredefined(int num1,int num2)
    {
        return Math.max(num1,num2);
    }


    public static void main(String[] args) {

        System.out.println(maxByManual(40,30));
        System.out.println(maxByPredefined(88,900));

    }
}
