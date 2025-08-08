package Backtracking;

public class SudokuLC {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board);

        for (char[] row : board) {
            for (char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void solveSudoku(char[][] board) {
        solve(board);
    }

    public static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // this is how we are replacing the r,c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in a row, then break
            if (!emptyLeft) {
                break;
            }
        }

        if (emptyLeft) {
            return true;
            // sudoku is solved
        }

        // backtrack
        for (char number = '1'; number <= '9'; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

//    public static boolean solve(char[][] board) {
//        int n = board.length;
//
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < n; col++) {
//                if (board[row][col] == '.') {
//                    for (char number = '1'; number <= '9'; number++) {
//                        if (isSafe(board, row, col, number)) {
//                            board[row][col] = number;
//
//                            if (solve(board)) {
//                                return true;
//                            } else {
//                                board[row][col] = '.';
//                            }
//                        }
//                    }
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    public static boolean isSafe(char[][] board, int row, int col, int num) {
        // check the row and column
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row or in the column
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        int rowStart = row - row % 3;
        int colStart = col - col % 3;

        for (int r = rowStart; r < rowStart + 3; r++) {
            for (int c = colStart; c < colStart + 3; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}