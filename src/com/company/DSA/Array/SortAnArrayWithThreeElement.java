package com.company.DSA.Array;

import java.util.Arrays;

public class SortAnArrayWithThreeElement {

    public static void main(String[] args) {
        int[] array = {0, 2, 1, 2, 0};
        //sortArray(array);
          sort012(array);
        //print the array
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
    public static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //Dutch National Flag Algorithm OR 3-way Partitioning:
    /*
    * Keep three indices low = 1, mid = 1 and high = N and there are four ranges, 1 to low (the range containing 0), low to mid (the range containing 1), mid to high (the range containing unknown elements) and high to N (the range containing 2).
      Traverse the array from start to end and mid is less than high. (Loop counter is i)
      If the element is 0 then swap the element with the element at index low and update low = low + 1 and mid = mid + 1
      If the element is 1 then update mid = mid + 1
      If the element is 2 then swap the element with the element at index high and update high = high – 1 and update i = i – 1. As the swapped element is not processed
      Print the output array.*/
    public static void sort012(int[] a) {
        int n = a.length;

        int lo = 0;
        int hi = n - 1;
        int mid = 0;

        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                   swap(lo, mid, a);
                   lo++;
                   mid++;
                   break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(mid, hi, a);
                    hi--;
                    break;
                }
            }
        }
    }

    // Approach-1:
    public static void sortArray(int[] array) {
           Arrays.sort(array);
    }
}
