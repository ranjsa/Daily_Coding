package com.company.PepCoding.Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lspace = 0;
        int rspace= n - 1;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < lspace; i++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int i = 0; i < rspace; i++) {
                System.out.print("\t");
            }

            System.out.println();
            lspace++;
            rspace--;
        }

    }
}
