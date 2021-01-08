package com.company.DSA.String;

public class IfAStringIsRotationOfAnotherString {
    public static void main(String[] args) {
       String s1 = "ABACD";
       String s2 = "CDABA";
        isRotationOfAnother(s1, s2);
    }
    public static void isRotationOfAnother (String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 != l2) {
            System.out.println("No");
        } else {
            String temp = s1 + s2;
            if (temp.indexOf(s2) != -1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
