package com.aryan.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        // this is replaced by the enhanced one below it
        // for (int row = 0; row < board.length; row++) {
        //     for (int col = 0; col < board[row].length; col++) {
        //         board[row][col] = ' ';
        //     }
        // }

        for (char[] ch : board) {
            Arrays.fill(ch, ' ');
        }

        char player = 'X';
        boolean gameOver = false;

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to 3x3 Tic-Tac-Toe game.");

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + "'s turn to place: ");

            try {
                int row = in.nextInt();
                int col = in.nextInt();

                if (!(row >= 0 && row < 3 && col >= 0 && col < 3)) {
                    System.out.println("Invalid position. Try again!");
                    continue;
                }

                if (board[row][col] == ' ') {
                    board[row][col] = player;
                    gameOver = haveWon(board, player);

                    if (gameOver) {
                        System.out.println("Congratulations!! Player '" + player + "' has won!");
                        System.out.println("Thank you for playing");
                        break;
                    } else {
                        player = (player == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("Invalid move. Try again!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid move. Try again!");
            }
        }
    }

    private static boolean haveWon(char[][] board, char player) {

        // checking all rows
        for (char[] row : board) {
            if (row[0] == player && row[1] == player && row[2] == player) {
                return true;
            }
        }

        // checking all columns
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // left to right diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        // right to left diagonal
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    private static void printBoard(char[][] board) {

        System.out.println("|---|---|---|");
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("|---|---|---|");
    }
}
