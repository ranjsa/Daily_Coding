package com.company.DSA.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//dont open this
/*
  2
a 4
r 2
u 2
h 3
                       a4r2u2h3

  2
a 4
s 2
u 2
h 2
 */
public class PrintAllDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        findAllDuplicates("tushar gauabh jha");
    }
    //Time O (N) | Space O(N)
    public static void findAllDuplicates(String s) {
      Map<Character, Integer> map = new HashMap<>();

      for (int i =0; i < s.length(); i++) {
          char c = s.charAt(i);
          if (!map.containsKey(c)) {
              map.put(c, 1);
          } else {
              map.put(c, map.get(c)+1);
          }
      }

      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
          if (entry.getValue() > 1)
              System.out.println(entry.getKey() + " " +entry.getValue());
      }
    }
}
