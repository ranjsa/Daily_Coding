package com.company.DSA.Array;

import java.util.Arrays;

public class IsArraySubSetOfAnotherArray {
    public static void main(String[] args) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
        System.out.println(isArraySubSet(arr1, arr2));
        System.out.println(isArraySubset(arr1, arr2));
    }

    // Approach-3 Using HashMap Time O(n) Space O(n)



    // Approach-2 Sorting + Binary Search
    // Time O(m Logm + n Logm)
    public static boolean isArraySubset(int[] array1, int[] array2) {
        Arrays.sort(array1);
        int i = 0;
        int n = array2.length;
        int m = array1.length;
        for (i = 0; i < n; i++) {
            if (binarySearch(array1, 0, m - 1, array2[i]) == -1) {
                return false;
            }
        }
        //If we reach here then all the elements are present
        return true;
    }
    public static int binarySearch(int[] array1, int low, int high, int x) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (array1[mid] == x) {
                return mid;
            } else if (array1[mid] < x) {
                return binarySearch(array1, (mid + 1), high, x);
            } else {
                return binarySearch(array1, low, (mid - 1), x);
            }
        }
        return -1;
    }



    //Approach-1 : Time O(n * m) | Space O(1)
    public static boolean isArraySubSet(int[] array1, int[] array2) {
       int m = array1.length;
       int n = array2.length;
       int i = 0;
       int j = 0;
       for (i =0; i < n; i++) {
           for (j = 0; j < m; j++) {
               if (array2[i] == array1[j]) {
                   break;
               }
           }
           //If the above inner loop was not broken
           //at all then arr2[i] is not present in the
           //array1
           if (j == m) {
               return false;
           }
       }
       //If we reach here then all the elements
       //of the array2 are present in array 1

       return true;
    }
}
