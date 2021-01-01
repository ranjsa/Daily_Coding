package com.company.DSA.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindTheCommonElementsinThreeArrays {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 3};//{1, 5, 10, 20, 40, 80};
        int[] array2 = {3, 3, 3};//{6, 7, 20, 80, 100};
        int[] array3 =  {3, 3, 3};//{3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(findCommonElements(array1, array2, array2));
    }
    //Approach : 1 Brute Force

    //Store all the numbers in the hashmap and then iterate through all the  numbers in the arrra 1 and check if it is present in all the three hashmap and if true return that number
    //Tiem O(N1 + N2 + N3) | Space = O(N1 + N2 + N3)



    //Appraoch : 2 Time O(n1 + n2 + n3) | Space O(1)
    public static ArrayList<Integer> findCommonElements(int[] array1, int[] array2, int[] array3) {
        //Put three piinters in the starting of the three arrays
        int n1 = array1.length;int n2 = array2.length;int n3 = array3.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
//      Set<Integer> set = new HashSet<Integer>();
        int i = 0; int j =0 ; int k = 0;
        while (i < n1 && j < n2 && k < n3) {
            //if the elements are equal return
            if (array1[i] == array2[j] && array2[j] == array3[k]) {
                list.add(array1[i]);
                i++;j++;k++;
            }
            //As arrays are sorted we can use this logic
            else if (array1[i] < array2[j]) i++;
             else if (array2[j] < array3[k]) j++;
             else k++;

             //to skip duplicate numbers
            if (i > 0) {
                int xx = array1[i-1];
                // it is necessary to put the i < n1 condition 1st  so that it does not throw ArrayOutOfBound Exception
                while ( i < n1 && array1[i] == xx ) {
                    i++;
                }
            }
            if (j > 0) {
                int yy = array2[j-1];
                while (j < n2 && array2[j] == yy) {
                    j++;
                }
            }
            if (k > 0) {
                int zz = array3[k-1];
                while (k < n3  && array3[k] == zz) {
                    k++;
                }
            }

        }

        if (list.size() == 0) {
            list.add(-1);
        }

        return list;
    }
}
