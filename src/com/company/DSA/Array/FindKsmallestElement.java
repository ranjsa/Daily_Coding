package com.company.DSA.Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKsmallestElement {
    public static void main(String[] args) {
         int[] array = {7, 10, 4, 3, 20, 15};
         int k = 3;
        // System.out.println("Kth Min Element is " + kThMinElm(array, k));
         System.out.println("Kth Min Element is " + kThMinElmMH(array, k));
    }

    //Approach - 1 Time O(nlog(n))
    // Sort the array and return k th element from the start to get kth smallest element
    public static int kThMinElm(int[] array, int k) {
        Arrays.sort(array);
        return array[k-1];
    }



    //Approach - 2

    public static int kThMinElmMH(int[] array, int k) {
       int n = array.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i =0; i < n; i++) {
            pq.add(array[i]);
        }
        int ans = 1;
        int i =1;
        while (!pq.isEmpty()) {
            if (i == k) {
             ans = pq.peek();
             break;
            }
            i++;
            pq.poll();
        }
      return ans;
    }
}
