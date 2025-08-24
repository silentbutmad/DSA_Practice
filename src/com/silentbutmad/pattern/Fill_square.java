package com.silentbutmad.pattern;

import java.util.Scanner;

class Fill_square
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row=sc.nextInt();
        System.out.println("Enter the number of column");
        int col=sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}