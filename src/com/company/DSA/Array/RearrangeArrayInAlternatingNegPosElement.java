package com.company.DSA.Array;

public class RearrangeArrayInAlternatingNegPosElement {
    public static void main(String[] args) {
        //int[] array = {-1, -2, -3, -4};
        int[] array = {2, 3, -4, -1, 6, -9};
        rearrange(array);
    }
    public static void rearrange(int array[]) {
       //take two pointer and place one at starting and other at end
        int start = 0;
        int end = array.length - 1;

        //Itereate start and end while the passes each other
        while (start <= end) {
            if (array[start] < 0 && array[end] > 0) {
                swap(start, end, array);
                start++;
                end--;
            } else if (array[start] > 0 && array[end] < 0) {
                start++;
                end--;
            } else if (array[start] > 0) {
                start++;
            } else if (array[end] < 0) {
                end--;
            }
        }
/*
        Here
        {2, 3, -4, -1, 6, 9}
        {2, 3, -4, -1, 6, 9}
        {2, 3, -4, -1, 6, 9}
        {2, 3, 6, -1, -4, 9}
                   ^
                  start
*/

        //either every element is negative or every element is positive
        if (start == 0 || start == array.length) {
            for(int i =0; i < array.length; i++) {System.out.print(array[i] + " ");}
        } else {
            int k =0;
            while (k < array.length && start < array.length) {
                swap(start, k, array);
                k += 2;
                start++;
            }
            /*
            {2, 3, 6, -1, -4, -9}
            {-1, 3, -4, 2, -9, 6}
             */
            for(int i =0; i < array.length; i++) {System.out.print(array[i] + " ");}
        }
    }
    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
