package com.company.DSA.Array;

/*
       Count Inversion
       {8, 4, 2, 1}
       (i < j) && (a[i] > a[j])

 */

public class CountInversion {

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 4, 1};
        System.out.println(countInversion(array));

        int[] temp = new int[array.length];
        int ans = mergeSort(array, temp, 0, array.length - 1);
        System.out.println(ans);

    }

    //Appraoch-2 Merge Sort Method
    //Time O(n log(n)) | Space(n) extra sapce is needed for merge sort
    public static int mergeSort(int[] array, int[] temp, int lo, int hi) {
        int mid, inv = 0;

        if (hi > lo) {
            mid = (hi + lo) / 2;

            inv += mergeSort(array, temp, lo, mid);
            inv += mergeSort(array, temp, mid + 1, hi);

            inv += merge(array, temp, lo, mid + 1, hi);
        }
        return inv;
    }

    public static int merge(int[] array, int[] temp, int left, int mid, int right) {
        int i,j,k;
        int inv = 0;

        i = left;
        j = mid;
        k = left;
        while ((i <= mid-1) && (j <= right)) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            }
            else {
                temp[k++] = array[j++];

                inv = inv + (mid - i);
            }
        }

        while (i <= mid - 1) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }
        for (i = left; i <= right; i++) {
            array[i] = temp[i];
        }

        return inv;
    }





    //Approach: 1 -> Brute Force
    //Time O(n^2) | Space O(1)
    public static int countInversion(int[] array) {
        int inv = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    inv++;
                }
            }
        }
        return inv;
    }


}

