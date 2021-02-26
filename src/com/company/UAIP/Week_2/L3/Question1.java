package com.company.UAIP.Week_2.L3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.StringTokenizer;
/*      Asked in GOOGLE
        Question:- You have two 1 D arrays of length n, where n is odd we need to check, if we can form pair of the
                   elements form both the arrays such that XOR of each pair is same.
        Constraints: 10^6
        Solution:-

 */
public class Question1 {
        public void solve() throws IOException {

        }

        public void solveWithTime() throws IOException {
            final long startTime = System.currentTimeMillis();
            //write code here to log time;
            final long endTime = System.currentTimeMillis();
            System.out.println("Total execution time: " + (endTime - startTime) + " ms");
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
            // new BasicTemplete().run();
        }
    }