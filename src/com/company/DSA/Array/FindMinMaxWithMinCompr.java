package com.company.DSA.Array;

public class FindMinMaxWithMinCompr {
    /*
             Maximum and minimum of an array using minimum number of comparisons


     */
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        maxAndMin(arr);
       Pair res =  getMinMax(arr);
       System.out.println(res.min + " Min & " + res.max + " Max");
    }


    // Approach 1  Time O(n) | Space O(1)
    //Total no of comparision = 2(n - 2) + 1++
    public static void maxAndMin(int[] array) {
        //if array is of length 1 return min and max as same element 1
        int n = array.length;
        int max, min;
        if (n == 1 ) {
            max = array[0];
            min = array[0];
            System.out.println(max + " " + min);
        } else {
            if (array[0] > array[1]) {
                max = array[0];
                min = array[1];
            } else {
                min = array[0];
                max = array[1];
            }
            for (int i = 2; i < n; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println(max + " " + min);
        }
    }
    //Apporach 2
    //Time O(N) | Space O(1)
    //Min Comparision odd = (3 * (n - 1)) / 2  even = 1 + 3*(n-2)/2
    static class Pair {
        int min;
        int max;
    }
    static Pair getMinMax(int[] array) {
        int n = array.length;

        Pair minMax = new Pair();
        int i;

        // If array has even number of elements then initialize the first two elements
        // as min and max
        if (n % 2 == 0) {
            if (array[0] > array[1]) {
                minMax.max = array[0];
                minMax.min = array[1];
            } else {
                minMax.min = array[0];
                minMax.max = array[1];
            }
            i = 2;
            //set the starting index for loop
        } else {
            minMax.min = array[0];
            minMax.max = array[0];
            i = 1;
            //set the starting index for loop
        }

        while (i < n - 1) {
            if (array[i] > array[i + 1]) {
                if (array[i + 1] < minMax.min) {
                    minMax.min = array[i + 1];
                }
                if (array[i] > minMax.max) {
                    minMax.max = array[i];
                }
            } else {
                if (array[i + 1] > minMax.max) {
                    minMax.max = array[i + 1];
                }
                if (array[i] < minMax.min) {
                    minMax.min = array[i];
                }
            }
            i += 2;
            // Increment the index by 2 as two
            // elements are processed in loop
        }

        return minMax;
    }
}
