package com.company.CookOff_Dec;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class MinAttendance {


    public void solve() throws IOException {
        int t = nextInt();
        while(t --> 0) {
            int n = nextInt();
            String a = nextToken();
            int daysLeft = 120 - n;
            float daysGone = 0;
            for (int i =0; i < a.length(); i++) {
                if (a.charAt(i) == '1') {
                    daysGone++;
                }
            }

            daysGone += daysLeft;
            float per1 = (daysGone / 120);
            float per = per1 * 100;
          //  out.println(per);
            if (per >= 75) {
                out.println("YES");
            } else {
                out.println("NO");
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
         new MinAttendance().run();
    }
}