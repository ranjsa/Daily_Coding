package com.company.PepCoding.Patterns;

import java.util.Scanner;

public class Pattern8 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int lspace = n - 1;
//        int rspace= 0;
//
//        for (int j = 0; j < n; j++) {
//            for (int i = 0; i < lspace; i++) {
//                System.out.print("\t");
//            }
//
//            System.out.print("*\t");
//
//            for (int i = 0; i < rspace; i++) {
//                System.out.print("\t");
//            }
//
//            System.out.println();
//            lspace--;
//            rspace++;
//        }
//
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int r = 0; r < n; r++) {
        for (int c = 0; c < n; c++) {
            if (r + c == n -1) {
                System.out.print("*\t");
            }else {
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }
}
