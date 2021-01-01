package com.company.DSA.Array;

public class SubArraySumEqualToZero {
    public static void main(String[] args) {
          int[] array = {4, 2, -3, 1, 6};
        System.out.println(isSubArraySumEqualTo0(array));
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
