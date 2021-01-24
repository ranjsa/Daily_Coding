package com.company.DSA.String;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequenceOfTheString {
    static List<StringBuilder> list = new ArrayList<>();
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder("");
        printAllSunsequence(str, sb);
        System.out.println(sb);
    }

    public static void printAllSunsequence(String str, StringBuilder sb) {
        if (str.length() == 0) {
            list.add(sb);
            return;
        }

        //recurse withoutt the char
        printAllSunsequence(str.substring(1), sb);
        printAllSunsequence(str.substring(1), sb.append(str.charAt(0)));
    }

}
