package com.company.DSA.Array;

import java.util.Arrays;

public class MinimizeTheMaxDiffBwHeights {
    public static void main(String[] args) {
        int arr[] = {6, 1, 9, 1, 1, 7, 9, 5, 2, 10};
        int n = arr.length;
        int k = 4;
        int maxDiff = getMaxDiff(arr, k, n);
        System.out.println(maxDiff);
    }

    public static int getMaxDiff(int[] arr, int k, int n) {
        //if there is only one element in the array
        if (n == 1) {
            return 0;
        }

        // Step: 1 Sort the array
        Arrays.sort(arr);

        //Initialize the Result
        int ans = arr[n-1] - arr[0];

        int sml = arr[0] + k;
        int big = arr[n-1] - k;
        int temp = 0;

        if (sml > big) {
            temp = sml;
            sml = big;
            big = temp;
        }

        //Traverse the middle elements
        for (int i = 1; i < n-1; i++) {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            //if both subraction and addition
            //do not change diff
            if (subtract >= sml || add <= big) {
                continue;
            }

            //Either substraction causes a amaller number
            // or addition causes a graeter number.
            if (big - subtract <= add - sml) {
                sml = subtract;
            } else {
                big = add;
            }
        }
        return Math.min(ans, big - sml);
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
