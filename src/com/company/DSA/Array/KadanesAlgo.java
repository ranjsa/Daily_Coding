package com.company.DSA.Array;

public class KadanesAlgo {


        // Function to find subarray with maximum sum
        // arr: input array
        // n: size of array
        public static int kadanes(int array[], int n){

            int maxSoFar = array[0];
            int maxEndingHere = array[0];

            for (int i =1; i < array.length; i++) {
                int num = array[i];
                maxEndingHere = Math.max(maxEndingHere + num, num);
                maxSoFar = Math.max(maxEndingHere, maxSoFar);
            }

            return maxSoFar;
        }

        public static void main(String[] args) {
            int[] array = {1,2,3,-2,5};
            int n = array.length;
            System.out.println(kadanes(array, n));
        }

}
