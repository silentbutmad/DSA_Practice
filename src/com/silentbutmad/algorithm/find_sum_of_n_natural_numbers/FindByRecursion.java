package com.silentbutmad.algorithm.find_sum_of_n_natural_numbers;

public class FindByRecursion {
    static int sum1(int num)
    {
        if(num==0) return 0 ;
        int sum=num;
        sum+=sum1(num-1);
        return sum;
    }
    static int sum2(int num)
    {
        //short notation
        if(num==0)
            return 0;
        else
            return num+sum2(num-1);
    }

    public static void main(String[] args) {
        System.out.println(sum1(10));
        System.out.println(sum2(10));
    }

}
