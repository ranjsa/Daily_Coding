package com.company.UAIP.Week_2.L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class CanJmpToLast {

        public void solve() throws IOException {
            final long startTime = System.currentTimeMillis();
           List<Integer> array = new ArrayList<>();
           int n = nextInt();
           for (int i =0; i < n; i++) {
               array.add(nextInt());
           }
            System.out.println(canJmp(array));
            final long endTime = System.currentTimeMillis();
            System.out.println("Total execution time: " + (endTime - startTime) + " ms");
        }
        public boolean canJmp(List<Integer> array) {
            int lastPos = array.size() - 1;
            int idx = 0;
            for (idx = lastPos - 1; idx >= 0; idx--) {
                if (idx + array.get(idx) >= lastPos) {
                    lastPos = idx;
                }
            }

            return lastPos == 0;
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
            new CanJmpToLast().run();
        }
    }