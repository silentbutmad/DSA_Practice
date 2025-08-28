package com.silentbutmad.algorithm.str_reverse;

import java.util.Scanner;

public class FindByRecursion {
    static String reverse(String s)
    {
        if(s==null || s.length()==1)
        {
            return s;
        }
        else {
            return reverse(s.substring(1))+s.charAt(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        System.out.println(reverse(s));
    }
}
