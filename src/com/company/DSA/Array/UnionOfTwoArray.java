package com.company.DSA.Array;

import java.util.HashSet;
import java.util.Set;

/*
Given two arrays A and B of size N and M respectively. The task is to find union between these two arrays.
Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
If there are repetitions, then only one occurrence of element should be printed in union.
 */
public class UnionOfTwoArray {
    public static void main(String[] args) {
        //1 2 3 4 5   7, 1, 5, 2, 3, 6
        //  3, 8, 6, 20, 7
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3};

        int res = findUnion(a, b);
        System.out.println(res);
    }
    //Approach - 1 Time O(n + m) | Space O(Avg(n, m))
    public static int findUnion(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        return set.size();
    }
}
