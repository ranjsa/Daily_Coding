package com.company.DSA.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.StringTokenizer;


public class SpiralTraversal {
        public void solve() throws IOException {
            // Input matrix
            int r = nextInt();
            int c = nextInt();
            int[][] mat = new int[r][c];
            for (int i =0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    mat[i][j] = nextInt();
                }
            }

            //Spiral Traversal
            int startRow = 0;
            int startCol = 0;
            int endRow = r-1;
            int endCol = c-1;

            //traversal
            int row = startRow;
            int col = startCol;
            int count = 0;
            int totalCount = r * c;

            while (count < totalCount) {
                // inc. column
                for (col = startCol; col <= endCol && count < totalCount; col++) {
                    out.print(mat[row][col] + " ");
                    count++;
                }
                col--;
                startRow++;

                // inc. row
                for (row = startRow; row <= endRow && count < totalCount; row++) {
                    out.print(mat[row][col] + " ");
                    count++;
                }
                row--;
                endCol--;

                // dec. column
                for (col = endCol; startCol <= col && count < totalCount; col--) {
                    out.print(mat[row][col] + " ");
                    count++;
                }
                col++;
                endRow--;

                // dec. row
                for (row = endRow; row >= startRow && count <= totalCount; row--) {
                    out.print(mat[row][col] + " ");
                    count++;
                }
                row++;
                startCol++;
            }
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
             new SpiralTraversal().run();
        }
    }