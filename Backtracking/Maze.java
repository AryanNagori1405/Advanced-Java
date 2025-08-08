package Backtracking;

import java.util.List;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazeCountPath(3, 3));

//        mazePath("", 3, 3);

//        System.out.println(mazePathList("", 3, 3));

//        System.out.println(mazePathListDiagonal("", 3, 3));

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        mazePathObstacle("", maze, 0, 0);
    }

    private static int mazeCountPath(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = mazeCountPath(row - 1, col);
        int right = mazeCountPath(row, col - 1);

        return left + right;
    }

    private static void mazePath(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if (row > 1) {
            mazePath(processed + 'D', row - 1, col);
        }

        if (col > 1) {
            mazePath(processed + 'R', row, col - 1);
        }
    }

    private static ArrayList<String> mazePathList(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if (row > 1) {
            ans.addAll(mazePathList(processed + 'D', row - 1, col));
        }

        if (col > 1) {
            ans.addAll(mazePathList(processed + 'R', row, col - 1));
        }
        return ans;
    }

    private static ArrayList<String> mazePathListDiagonal(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if (row > 1 && col > 1) {
            ans.addAll(mazePathListDiagonal(processed + 'D', row - 1, col - 1));
        }

        if (row > 1) {
            ans.addAll(mazePathListDiagonal(processed + 'V', row - 1, col));
        }

        if (col > 1) {
            ans.addAll(mazePathListDiagonal(processed + 'H', row, col - 1));
        }
        return ans;
    }

    private static void mazePathObstacle(String processed, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed);
            return ;
        }

        if (!maze[row][col]) {
            return;
        }

        if (row < maze.length - 1) {
            mazePathObstacle(processed + 'D', maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            mazePathObstacle(processed + 'R', maze, row, col + 1);
        }
    }
}