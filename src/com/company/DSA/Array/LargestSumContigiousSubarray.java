package com.company.DSA.Array;

public class LargestSumContigiousSubarray {
    public static void main(String[] args) {
        int[] array = {1,2,3,-2,5};
        int maxSum = maxSumSubArray(array);
        System.out.println(maxSum);
    }

    public static int maxSumSubArray(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                int num = array[i];

                maxEndingHere = Math.max(maxEndingHere + num, num);
                maxSoFar = Math.max(maxSoFar, maxEndingHere);
            }
        }

        return maxSoFar;
    }
}
