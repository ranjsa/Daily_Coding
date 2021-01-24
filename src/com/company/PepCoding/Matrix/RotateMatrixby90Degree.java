package com.company.PepCoding.Matrix;

import java.util.Scanner;

public class RotateMatrixby90Degree {
    public static void main(String[] args) throws Exception {

        //Take INPUT
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        /*                (i,j) =>  (j,i)

                   1 2      (0,0) (0,1)    ->
                   3 4      (1,0) (1,1)
         */

        // Make row to col
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = array[j][i];
                array[j][i] = array[i][j];
                array[i][j] = temp;
            }
        }

        //Reverse the array
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = array[0].length - 1;
            while (start < end) {
                int temp = array[i][start];
                array[i][start] = array[i][end];
                array[i][end] = temp;
                start++;
                end--;
            }
        }

        display(array);

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
