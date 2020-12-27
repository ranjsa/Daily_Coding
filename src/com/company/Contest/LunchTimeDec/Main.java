package com.company.Contest.LunchTimeDec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class Main {



    public void solve() throws IOException {
        int t = nextInt();
        while(t --> 0) {
            String s = nextToken();
            int noOfDoubles = 0;
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (map.containsKey(c)) {
                   map.put(c, map.get(c) + 1);
                   int count = map.get(c);
                   if (count == 2) {
                       noOfDoubles += 1;
                       map.put(c, 0);
                   }
                } else {
                    map.put(c, 1);
                }
            }
            int rem = (s.length()) - (noOfDoubles * 2);
            if (rem >= noOfDoubles) {
                out.println(noOfDoubles);
            } else {
                out.println(noOfDoubles - rem);
            }

        }
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solve();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    BufferedReader br;
    StringTokenizer in;
    PrintWriter out;

    public String nextToken() throws IOException {
        while (in == null || !in.hasMoreTokens()) {
            in = new StringTokenizer(br.readLine());
        }
        return in.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    public int[] nextArr(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = nextInt();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
         new Main().run();
    }
}