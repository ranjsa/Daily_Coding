package com.company.UAIP.Week_2.L2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*
 Question 3 :- You have a 2D array of Integers. Calculate the total sum of all sub matrix for the given matrix.
      Constraint n,m <= 10 ^ 4

 Brute Force :- Calculate all the submatrix and sum it up.
 TIME Complexity :- O(n^6)

                For each top left there can be multiple bottom right

                algo
                // Calculate TOP LEFT
                for (int i =0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        [i,j] -> TOP LEFT

                        //Calculate Bottom Right
                        for (int k =0; k < n; k ++) {
                             for (int l = 0; l < m; l++) {
                                  [k, l] -> BOTTOM RIGHT

                                  //SUM all the elements
                                  for (int x =i; x < k; x++) {
                                      for (int y = j; j <= l; y++) {
                                           sum += array[x][y];
                                      }
                                  }
                             }
                        }
                    }
                }

  Optimaization -> Use Prefix matrix
                   1.) You are going to all submatrix
                   2.) You are calculating the overlapping part again and again
        -> Insted of calculating overlapping part again and again we can insted calculate the no. of submatrix the cell
           is the part of
           then we can use  array[x][y] * count of submatrix

           -> For a given [x][y] total number of top lefts => (x+1) * (y+1)
           -> For a given [x][y] total number of bottom rights => (n-x) * (m-y)

         -> Total number of sub matrix for cell (x,y) is (no of top lefts) * (no of bottom rights)



 */

public class CountofSubMatrices {
        public void solve() throws IOException {
             int n = nextInt();
             int m = nextInt();
             ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
             for (int i = 0; i < n; i++) {
                 ArrayList<Integer> row = new ArrayList<>();
                 for (int j = 0; j < m; j++) {
                     row.add(nextInt());
                 }
                 array.add(row);
             }
            System.out.println(totalSumofSubMat(array));
        }

        public int totalSumofSubMat(ArrayList<ArrayList<Integer>> array) {
            int sum = 0;
            int n = array.size(); // no of rows
            int m = array.get(0).size(); // no of col

            for (int i =0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // Lets go to each cell and calculate it's contribution
                    sum += (array.get(i).get(j)) * ((i+1) * (j+1)) * ((n-i) * (m-j));
                }
            }
            return sum;
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
            new CountofSubMatrices().run();
        }
    }