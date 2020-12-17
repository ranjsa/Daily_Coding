package com.company.DSA.Array;

public class ReverseArray {
    public static void main(String[] args) {
         int arr[] = {4};//{4, 5, 1, 2}; //{1, 2, 3};
         reverseArray(arr);
         for (int a : arr) {
             System.out.println(a);
         }
    }
    //Approach 1
    //Approach 2 do approach 1 recursuvely
    //Time O(n) | Space O(1)
    public static void reverseArray(int[] array) {
        //base case: if array elements are less than or equal to 1 return same arrray
        if (array.length <= 1) {
            return;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            swap(left, right, array);
            left++;
            right--;
        }
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
