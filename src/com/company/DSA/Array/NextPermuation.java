package com.company.DSA.Array;

public class NextPermuation {
     public static void nextPermutation(int[] array) {
         if (array == null || array.length <= 1) {
             return;
         }

         //2nd last element
         int i = array.length - 2;

         while ( i >= 0 && array[i] >= array[i + 1]) { i --; }
         if (i >= 0) {
             int j = array.length - 1;
             while (array[j] <= array[i]) {
                 j--;
             }
             swap(array, i, j);
         }
         reverse(array, i + 1, array.length - 1);
     }
     public static void swap(int[] array, int i, int j) {
         int temp = array[i];
         array[i] = array[j];
         array[j] = temp;
     }

     public static void reverse(int[] array, int i, int j) {
         while (i < j) {
             swap(array, i++, j--);
         }
     }
}
/*

 */