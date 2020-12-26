package com.company.DSA.Array;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {0, 2, 6, 8, 9};

        mergeArray(array1, array2);

    }

    //Approach 1 Time O(n * m) | Space O(1)
    public static void mergeArray(int[] arr1, int[] arr2)
    {

        // length of first arr1
        int n = arr1.length;

        // length of second arr2
        int m = arr2.length;

        // Now traverse the array1 and if
        // arr2 first element
        // is less than arr1 then swap
        for (int i = 0; i < n; i++) {

            if (arr1[i] > arr2[0]) {

                // swap
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // after swaping we have to sort the array2
                // again so that it can be again swap with
                // arr1

                // we will store the firstElement of array2
                // and left shift all the element and store
                // the firstElement in arr2[k-1]

                int firstElement = arr2[0];

                int k;
                for (k = 1;
                     k < m && arr2[k] < firstElement;
                     k++)
                {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = firstElement;
            }
        }

        // read the arr1
        for (int i : arr1) {
            System.out.print(i + " ");
        }

//        System.out.print();
        // read the arr2
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
