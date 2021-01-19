package com.company.PepCoding.Patterns;
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = 1;
        int star = (n / 2) + 1;
        int i;
        for (i = 0; i < n; i++) {

            for (int st = 1; st <= star; st++) {
                System.out.print("*\t");
            }
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("\t");
            }
            for (int st = 1; st <= star; st++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i < n/2) {
                space+=2;
                star--;
            } else {
                space-=2;
                star++;
            }
        }
    }
}
