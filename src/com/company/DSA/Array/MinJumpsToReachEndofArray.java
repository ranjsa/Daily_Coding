package com.company.DSA.Array;

public class MinJumpsToReachEndofArray {
    // Driver method to test the above function
    public static void main(String[] args) {
        int arr[] = new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        // calling minJumps method
        System.out.println(minJumps(arr));
    }
    public static int minJumps(int[] array) {
        int n = array.length;
        if (n == 1) {
            return 0;
        }

        // Return -1 if not possible to jump
        if (array[0] == 0)
            return -1;

        int maxR = array[0];
        int step = array[0];
        int jump = 1;

        for (int i =1; i < n-1; i++) {
            if (i == n-1) {
                return jump;
            }
            maxR = Math.max(maxR, i + array[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxR) {
                    return -1;
                }
                step = maxR - i;
            }
        }
        return jump;
    }
}
