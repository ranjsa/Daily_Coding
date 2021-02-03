package com.company.DSA.String;


import java.util.Scanner;

public class Solution {
    private StringBuilder output = new StringBuilder();
    private final String inputstring;
    public Solution( final String str ){
        inputstring = str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        Solution c = new Solution(in);
        c.combine();
    }

    public void combine() {
        combine(0);
    }

    public void combine( int start) {
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
            System.out.println( output );
            if ( i < inputstring.length() )
                combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
}





















//public class Combinations {
//    private StringBuilder output = new StringBuilder();
//    private final String inputstring;
//    public Combinations( final String str ){
//        inputstring = str;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String in = sc.nextLine();
//        Combinations c = new Combinations(in);
//        c.combine();
//    }
//
//    public void combine() {
//        combine(0);
//    }
//
//    public void combine( int start) {
//        for( int i = start; i < inputstring.length(); ++i ){
//            output.append( inputstring.charAt(i) );
//            System.out.println( output );
//            if ( i < inputstring.length() )
//                combine( i + 1);
//            output.setLength( output.length() - 1 );
//        }
//    }
//}



/*
 private StringBuilder output = new StringBuilder();
    private final String inputstring;
    public Combinations( final String str ){
        inputstring = str;
        System.out.println("The input string  is  : " + inputstring);
    }


    public static void main (String args[])
    {
        Combinations combobj= new Combinations("abcd");
        System.out.println("");
        System.out.println("");
        System.out.println("All possible combinations are :  ");
        System.out.println("");
        System.out.println("");
        combobj.combine();
    }

    public void combine() { combine( 0 ); }
    private void combine(int start ){
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
            System.out.println( output );
            if ( i < inputstring.length() )
                combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
 */