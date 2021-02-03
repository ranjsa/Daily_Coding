package com.company.PepCoding.Recursion;

import java.util.Scanner;
/*
            x^n = x^n/2 * x^n/2

            if (x is odd) {
                x^n = x^n/2 * x^n/2 * x;
            } else if (x is even) {
                x^n = x^n/2 * x^n/2;
            }
 */
public class LograthmicPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
    public static int power(int x, int n) {
        System.out.println(x + " " + n);
        //base case
        if (n == 0) {
            return 1;
        }

        // faith
        int xPowNb2 = power(x, n/2);

        //my work
        int xPowN = xPowNb2 * xPowNb2;
        if (n % 2 == 1) {
            xPowN = xPowN * x;
        }
        return xPowN;
    }

}
