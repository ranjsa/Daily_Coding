package com.company.DSA.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NoOfTwoPairSum {
    public static void main(String[] args) {
        int[] array = { 1, 5, 7, -1, 5 };
        int K = 6;
        System.out.println(noOfTwoPairSum(array, K));
    }
    /*
           1 5 7 1
           1 1 5 7

     */

    //Approach-1
    public static int noOfTwoPairSum(int[] array, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i= 0; i < array.length; i++) {
            if (map.containsKey(k - array[i])) {
                count++;
            }
            //dont need the value just storing it
            map.put(array[i], i);
        }
        return count;
    }


}
