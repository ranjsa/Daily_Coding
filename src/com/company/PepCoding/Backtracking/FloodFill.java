package com.company.PepCoding.Backtracking;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr =new int[n][m];
        for (int i =0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printPath(arr, 0,0, "", new boolean[n][m]);
    }

    public static void printPath(int [][] maze, int r, int c, String psf, boolean [][]visited) {

        //base cases
        if (r < 0 || c < 0 || r == maze.length || c == maze[0].length || maze[r][c] == 1 || visited[r][c] == true) {
            return;
        }

        // check for destination
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }

        //mark current position visited
        visited[r][c] = true;

        // traverse T L D R
        printPath(maze, r - 1, c, psf + "t", visited);
        printPath(maze, r, c - 1, psf + "l", visited);
        printPath(maze, r + 1, c, psf + "d", visited);
        printPath(maze, r, c + 1, psf + "r", visited);

        // unmark
        visited[r][c] = false;
    }

}
