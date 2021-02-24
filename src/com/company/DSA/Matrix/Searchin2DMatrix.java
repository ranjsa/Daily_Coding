package com.company.DSA.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.StringTokenizer;

public class Searchin2DMatrix {
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
            int target = nextInt();
            //
            boolean flag = false;
            int startRow = 0;
            int startCol = mat[0].length - 1;
            while (flag == false && startRow < mat.length) {
                if (mat[startRow][startCol] < target) {
                    startRow++;

                    //continue;
                }else if (mat[startRow][startCol] > target) {
                    for (int col = 0; col <= startCol; col++) {
                        if (mat[startRow][col] == target) {
                            flag = true;
                            break;
                        }

                    }
                    startRow++;
                }else if (mat[startRow][startCol] == target) {
                    flag = true;
                    break;
                }
            }
            out.println(flag);
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
            new Searchin2DMatrix().run();
        }
    }