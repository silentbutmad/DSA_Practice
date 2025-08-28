package com.silentbutmad.pattern;

import java.util.Scanner;

public class Square_Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        System.out.println("Enter the number of column");
        int col = sc.nextInt();
        for (int i = 0; i < row; i++) {
            char c = 'A';
            for (int j = 0; j < col; j++, c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
