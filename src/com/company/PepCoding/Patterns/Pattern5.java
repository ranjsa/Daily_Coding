package com.company.PepCoding.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = 1;
        int space = n / 2;
        int i;
        for (i = 0; i < n; i++) {
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("\t");
            }
            for (int st = 1; st <= star; st++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i < n/2) {
                star+=2;
                space--;
            } else {
                star-=2;
                space++;
            }
        }
    }
}
