package com.company.DSA.Array;

public class MvAllNegNoOneSide {
    public static void main(String[] args)
    {
        int[] arr = { -12, 11, -13, -5,
                6, -7, 5, -3, 11 };

        twoPointerAlgo(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }


    }
    //Time O(n) | Space O(1)
//    Algorithm
//    Two Pointer Approach: The idea is to solve this problem with constant space and linear time is by using a two-pointer or two-variable approach where we simply take two variables like left and right which hold the 0 and N-1 indexes. Just need to check that :
//
//    Check If the left and right pointer elements are negative then simply increment the left pointer.
//    Otherwise, if the left element is positive and the right element is negative then simply swap the elements, and Simultaneously increment or decrement the left and right pointers.
//            Else if the left element is positive and the right element is also positive then simply decrement the right pointer.
//    Repeat the above 3 steps until the left pointer ≤ right pointer.
    public static void twoPointerAlgo(int[] array) {
        int n = array.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (array[start] < 0 && array[end] < 0) {
                start++;
            } else if (array[start] > 0 && array[end] > 0) {
                end--;
            } else if (array[start] > 0 && array[end] < 0) {
                swap(start, end, array);
                start++;
                end--;
            }else {
                start++;
                end--;
            }
        }
    }
    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
