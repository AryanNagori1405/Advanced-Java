package Backtracking;

import java.util.Arrays;

public class ALLPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

//        allPath("", board, 0, 0);

        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }

    // Backtracking - make a change then reverse the change when that work is done
    private static void allPath(String processed, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed);
            return ;
        }

        if (!maze[row][col]) {
            return;
        }

        // I am considering this block in my path
        maze[row][col] = false;

        if (row > 0) {
            allPath(processed + 'U', maze, row - 1, col);
        }

        if (row < maze.length - 1) {
            allPath(processed + 'D', maze, row + 1, col);
        }

        if (col > 0) {
            allPath(processed + 'L', maze, row, col - 1);
        }

        if (col < maze[0].length - 1) {
            allPath(processed + 'R', maze, row, col + 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[row][col] = true;
    }

    private static void allPathPrint(String processed, boolean[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        // I am considering this block in my path
        maze[row][col] = false;

        path[row][col] = step;

        if (row > 0) {
            allPathPrint(processed + 'U', maze, row - 1, col, path, step + 1);
        }

        if (row < maze.length - 1) {
            allPathPrint(processed + 'D', maze, row + 1, col, path, step + 1);
        }

        if (col > 0) {
            allPathPrint(processed + 'L', maze, row, col - 1, path, step + 1);
        }

        if (col < maze[0].length - 1) {
            allPathPrint(processed + 'R', maze, row, col + 1, path, step + 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
