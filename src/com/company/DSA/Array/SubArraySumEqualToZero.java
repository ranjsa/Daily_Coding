package com.company.DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualToZero {
    public static void main(String[] args) {
          int[] array = {4, 2, -3, 1, 6};
        System.out.println(isSubArraySumEqualTo0_2(array));
    }

    public static boolean isSubArraySumEqualTo0_2 (int[] array) {
        int sum = 0;
        int flag = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0 ; i < array.length; i++) {
            sum += array[i];
            if (sum == 0 || map.containsKey(sum) || array[i] == 0) {
                flag = 1;
                break;
            } else {
                map.put(array[i],i);
            }
        }

        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }

    //Approach 1 Time O(n^2) | Space O(1)
    public static boolean isSubArraySumEqualTo0 (int[] array) {
        int flag = 0;
        int n = array.length;
        for (int i =0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += array[j];
                if (sum == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }
}
