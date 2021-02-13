package com.company.UAIP.Week_2.L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class MinJmpToReachLast {
        public void solve() throws IOException {
            int t = nextInt();
            while(t --> 0) {}
        }

        public void solveWithTime() throws IOException {
            final long startTime = System.currentTimeMillis();
            //---------start----------------
            List<Integer> array = new ArrayList<>();
            int n = nextInt();
            for (int i =0; i < n; i++) {
                array.add(nextInt());
            }
            System.out.println(minJmp(array));
            //----------end-----------------
            final long endTime = System.currentTimeMillis();
            System.out.println("Total execution time: " + (endTime - startTime) + " ms");
        }

        public int minJmp (List<Integer> array) {
            //size of the array
            int n = array.size();

            //if array size == 0 or == 1 return 0 jumps
            if (n == 0 || n == 1) {
                return 0;
            }
            //this is the last max jmp taken where we iterate to find next max jmp containtender
            int last_max_jmp = array.get(0);

            //this is the next max best candidate to take a jmp
            int next_max_jmp = array.get(0);

            int jmp = 1;
            for (int i = 0; i < n; i++) {
                if (last_max_jmp < i) {
                    last_max_jmp = next_max_jmp;
                    jmp++;

                    //optimization
                    if (last_max_jmp >= n - 1) {
                        return jmp;
                    }
                }
                next_max_jmp = Math.max(next_max_jmp, i + array.get(i));

            }
            return jmp;
        }

        public void run() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(System.out);

                //solve();
                solveWithTime();

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
            new MinJmpToReachLast().run();
            new MinJmpToReachLast().run();
        }
    }