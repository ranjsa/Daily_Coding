package com.company.DSA.Array;

public class MaxProductSubarray {
    public static void main(String[] args) {

    }
    public static int maxProduct(int[] array) {
        int n = array.length;


        int minVal = array[0];
        int maxVal = array[0];

        int maxProduct = array[0];

        for (int i =1; i < n; i++) {
             if (array[i] < 0) {
                 int temp = maxVal;
                 maxVal = minVal;
                 minVal = temp;
             }

             maxVal = Math.max(array[i], maxVal * array[i]);
             minVal = Math.min(array[i], minVal * array[i]);

             //Max Product of array
            maxProduct = Math.max(maxProduct, maxVal);
        }
        //Return the maxProduct
        return maxProduct;
    }
}
