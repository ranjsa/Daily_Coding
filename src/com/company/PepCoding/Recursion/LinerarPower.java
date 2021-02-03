package com.company.PepCoding.Recursion;

import java.util.Scanner;
/*
2 5
2 4
2 3
2 2
2 1
2 0
32
 */
public class LinerarPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));

    }
   public static int power(int x, int n) {
        //for debuging
       System.out.println(x + " " + n);

        // base case
        if (n == 0) {
            return 1;
        }

       // faith
       int xPowNm1 = power(x, n - 1);

       // my work
       int xPowN = xPowNm1 * x;

        return xPowN;
   }
}
