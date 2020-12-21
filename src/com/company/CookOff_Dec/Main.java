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
            long x = nextLong();
            long y = nextLong();
            long k = nextLong();
            long n = nextLong();

            long d = Math.abs(x - y);
            if ((isOdd(k) && isOdd(d)) || (isOdd(d) && !isOdd(k)) || (!isOdd(k) && !isOdd(d) && isOdd(n))) {
                out.println("No");
            }else {
                out.println("Yes");
            }
        }


    }

    public boolean isOdd(long n) {
        if (n % 2 == 0) {
            return false;
        } else {
            return true;
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