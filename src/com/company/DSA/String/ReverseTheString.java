package com.company.DSA.String;

public class ReverseTheString {
    public static void main(String[] args) {
        String s = "tushar";

        System.out.println(reverseString(s));
    }



    //Approach - 1: Time O(N) | Space O(1)
    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;


        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }
        return new String(charArray);
    }
}
