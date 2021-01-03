package com.company.DSA.Array;


    /*
               -1, -3, -10, 0, 60


               maxVal = 3
               minVal = -1
               maxProduct = -1
     */


public class MaxProductSubarray {

    public static void main(String[] args) {
        int arr[] = { -1, -3, -10, 0, 60 };
        System.out.println("Max Product " + maxProduct(arr));
    }

    //Approach:1 Time O(n) | Space O(1)
    public static int maxProduct(int[] array) {
        // array length
        int n = array.length;

        // take two variables to store maximum and minimum Value
        int minVal = array[0];
        int maxVal = array[0];
        //max product till index
        int maxSoFar = array[0];

        for (int i =1; i < n; i++) {
            /*
                When multiplied by -ve number,
                maxVal becomes minVal
                and minVal becomes maxVal
            */
             if (array[i] < 0) {
                 int temp = maxVal;
                 maxVal = minVal;
                 minVal = temp;
             }

             maxVal = Math.max(array[i], maxVal * array[i]);
             minVal = Math.min(array[i], minVal * array[i]);

             //Max Product of array
            maxSoFar = Math.max(maxSoFar, maxVal);
        }
        //Return the maxProduct
        return maxSoFar;
    }
}
