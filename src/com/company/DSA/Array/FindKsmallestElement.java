package com.company.DSA.Array;

import java.util.Arrays;

public class FindKsmallestElement {
    public static void main(String[] args) {
         int[] array = {7, 10, 4, 3, 20, 15};
         int k = 3;
         System.out.println("Kth Min Element is " + kThMinElm(array, k));
    }

    //Approach - 1 Time O(nlog(n))
    // Sort the array and return k th element from the start to get kth smallest element
    public static int kThMinElm(int[] array, int k) {
        Arrays.sort(array);
        return array[k-1];
    }
}
