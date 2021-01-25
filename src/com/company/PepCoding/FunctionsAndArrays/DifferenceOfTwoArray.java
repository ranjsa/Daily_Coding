package com.company.PepCoding.FunctionsAndArrays;

import java.util.Scanner;

public class DifferenceOfTwoArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Take Input
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i =0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i =0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        //Make diff(ans) array which will be equal to length of a2 array
        int[] diff = new int[n2];

        //Make pointers
        int c = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        //Algo
        while (k >= 0) {
            int d = 0;
            int aval = i >= 0 ? a1[i] : 0;

            if (a2[j] + c >= aval) {  // if num 1 is same or greater than num 2 eg.-> 3 - 2
                d = (a2[j] + c) - aval;
                c = 0;
            } else { // if num 1 is smaller than num 2 eg.->   2 - 3
                d = (a2[j] + c + 10) - aval;
                c = -1;
            }
            //dump the calculated d to ans
            diff[k] = d;

            i--;
            j--;
            k--;
        }

       // Printing
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        for (int m = idx; m < diff.length; m++) {
            System.out.println(diff[m]);
        }

    }
}
