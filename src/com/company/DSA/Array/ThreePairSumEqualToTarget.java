package com.company.DSA.Array;

import java.util.Arrays;

public class ThreePairSumEqualToTarget {
    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        findTriplets1(A, sum);
        findTriplets2(A, sum);
    }


    //Approach: 2 Time O(N^2) | Space O(1)
    public static void findTriplets2(int[] array, int sum) {
        int n = array.length;
        //to handle n < 3 case
        if (n < 3) {
            System.out.println(0);
            return;
        }
        Arrays.sort(array);

        for (int i = 0; i < n-2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int currentSum = array[i] + array[l] + array[r];
                if (currentSum == sum) {
                    System.out.println("Triplets are " + array[i] + ", " + array[l] +", "+ array[r]);
                    l++;
                    r--;
                } else if (currentSum < sum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
    }


    //Approach: 1 Time O (n^3) | Space O(1)
    public static void findTriplets1(int[] array, int sum) {
        int n = array.length;
        if (n < 3) {
            System.out.println(0);
            return;
        }

        for (int i =0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int currentSum = array[i] + array[j] + array[k];
                    if (currentSum == sum) {
                        System.out.println("1st " + array[i] + " 2st " + array[j] + " 3st " + array[k]);
                    }
                }
            }
        }
    }
}
