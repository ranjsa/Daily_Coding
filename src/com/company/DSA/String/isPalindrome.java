package com.company.DSA.String;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPainDrome(s));
    }

    // Time O (n) | Space  O(1)
    public static boolean isPainDrome(String s) {
        int l = 0;
        int h = s.length() - 1;

        while (l < h) {
            if (s.charAt(l++) != s.charAt(h--)) {
                return false;
            }
        }
        return true;
    }
}
