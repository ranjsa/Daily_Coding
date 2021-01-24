package com.company.PepCoding.Matrix;

import java.util.Scanner;

public class TheStateofWakanda {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int r = sc.nextInt();
       int c = sc.nextInt();
       int[][] array = new int[r][c];
       for (int i =0; i < r; i++) {
           for (int j =0; j < c; j++) {
               array[i][j] = sc.nextInt();
           }
       }

        for (int j = 0; j < array[0].length; j++) {
            if (j % 2 != 0) {
                for (int i = array.length - 1; i >= 0; i--) {
                    System.out.print(array[i][j] + " ");
                }
            } else if (j % 2 == 0) {
                for (int i =0; i < array.length; i++) {
                    System.out.print(array[i][j] + " ");
                }
            }

        }
    }
}
