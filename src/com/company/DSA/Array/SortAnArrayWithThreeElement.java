package com.company.DSA.Array;

import java.util.Arrays;

public class SortAnArrayWithThreeElement {

    public static void main(String[] args) {
        int[] array = {0, 2, 1, 2, 0};
        sortArray(array);
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
    // App
    public static void sortArray(int[] array) {
           Arrays.sort(array);
    }
}
