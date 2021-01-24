package com.company.PepCoding.FunctionsAndArrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Take Input
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Find MAX
        int max = Integer.MIN_VALUE;
        for (int i =0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        //Algo
        for (int floor = max; floor >= 1; floor--) {
            for (int i =0; i < array.length; i++) {
                if (array[i] >= floor) {
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            //hit enter
            System.out.println();
        }
    }
}
