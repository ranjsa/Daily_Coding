//package com.company.CookOff_Dec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Main {

    public void solve() throws IOException {
        int t = nextInt();
        while(t --> 0) {
              String s = nextToken();
              int countZero = 0;
              int countOne = 0;
              int ans = 0;
              for (int i =0; i < s.length(); i++) {
                  if (s.charAt(i) == '0') {
                      countZero += 1;
                  } else {
                      countOne += 1;
                  }
              }

              if (s.length() % 2 == 1 || countZero == 0 || countOne == 0) {
                  ans = -1;
              } else {
                  int diff = Math.abs(countZero - countOne);
                  ans = diff / 2;
              }

              out.println(ans);
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