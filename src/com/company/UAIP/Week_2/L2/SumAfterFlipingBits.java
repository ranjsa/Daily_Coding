package com.company.UAIP.Week_2.L2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*        Asked in AMAZON

           You have a binary 2-D array. You can perform one operation on the rows orr the column
              operation :- Flip the value i.e make 0 -> 1 or 1 -> 0 You can perform this operation multiple times
           At last treat each row as a complete binary number convert it to decimal and sum it up. Find the max
           posssible SUM.
           Given :- N x M matrix N,M <= 10^4



           SOLUTION:-
                 step-1 If we want our rows to give max result then we should set our MSB to 1 if the MSB of any row is
                        not 1 then flip the row.
                 step-2 From right to left the max 1 we have the max the value would be
                 step-3 While flipping any column for internal If we have more than half bits one, then dont flip

 */
public class SumAfterFlipingBits {

        public void solve() throws IOException {
//            int t = nextInt();
//            while(t --> 0) {}
        }

        public void solveWithTime() throws IOException {
            final long startTime = System.currentTimeMillis();
            //write code here to log time;
            ArrayList<ArrayList<Integer>> array = new ArrayList<> ();
            int n = nextInt();
            int m = nextInt();

            for (int i =0; i < n; i++) {
                ArrayList<Integer> rows = new ArrayList<>();
                for (int j =0; j < m; j++) {
                    rows.add(nextInt());
                }
                array.add(rows);
            }

            System.out.println(findSum(array));
            System.out.println(array);

            final long endTime = System.currentTimeMillis();
            System.out.println("Total execution time: " + (endTime - startTime) + " ms");
        }

        public int findSum(ArrayList<ArrayList<Integer>> array) {
            int sum = 0;
            int n = array.size(); // number of rows
            int m = array.get(0).size(); // number of columns

            sum += (1 << (m - 1)) * n;  // contribution of Most significant bit
            for (int j = 1; j < m; j++) { // all the col
                int sameBit = 0;
                for (int i = 0; i < n; i++) { // all the row
                    if (array.get(i).get(j) == array.get(i).get(0)) {
                        sameBit++;
                    }
                }
                sum += (1 << (m - j - 1)) * Math.max(sameBit, n - sameBit);
            }

            return sum;
        }

        public void run() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(System.out);

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
            new SumAfterFlipingBits().run();
        }
    }