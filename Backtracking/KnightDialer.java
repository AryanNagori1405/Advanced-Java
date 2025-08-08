package Backtracking;

class KnightDialer {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        solveKnights(board, 0, 0, 8);
    }

    private static void solveKnights (boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            solveKnights(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            solveKnights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        solveKnights(board, row, col + 1, knights);
    }

    private static boolean isSafe (boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            return board[row - 2][col - 1];
        }

        if (isValid(board, row - 2, col + 1)) {
            return board[row - 2][col + 1];
        }

        if (isValid(board, row - 1, col - 2)) {
            return !board[row - 1][col - 2];
        }

        if (isValid(board, row - 1, col + 2)) {
            return !board[row - 1][col + 2];
        }

        return true;
    }

    // do not repeat yourself, hence created a function
    private static boolean isValid (boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print((element ? "K " : "X "));
            }
            System.out.println();
        }
    }
}
