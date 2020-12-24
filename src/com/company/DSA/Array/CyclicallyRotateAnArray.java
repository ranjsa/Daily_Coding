package com.company.DSA.Array;

public class CyclicallyRotateAnArray {
    public static void main(String[] args) {
         int[] array = {1, 2, 3, 4, 5};
         rotate(array);
         for (int a : array) {
             System.out.print(a + " ");
         }
    }

    // Time O(n) | Space O(1)
    public static void rotate(int[] array) {
        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }
}
