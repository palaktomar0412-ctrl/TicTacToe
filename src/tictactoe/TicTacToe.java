package tictactoe;

import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'X', 'X', 'X'},
        {'-', '-', '-'},
        {'-', '-', 'O'}
    };

    public static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(int row, int col) {
        return board[row][col] == '-';
    }

    public static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void computerRandomMove() {
        Random rand = new Random();
        int slot, row, col;

        do {
            slot = rand.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;
        } while (!isValidMove(row, col));

        System.out.println("Computer selected slot: " + slot);
        placeMove(row, col, 'O');
    }

    public static boolean checkWin(char symbol) {

        // rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }
        }

        // columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == symbol &&
                board[1][j] == symbol &&
                board[2][j] == symbol) {
                return true;
            }
        }

        // diagonal 1
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        // diagonal 2
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("Current Board:");
        displayBoard();

        if (checkWin('X')) {
            System.out.println("X wins!");
        }
        else if (checkWin('O')) {
            System.out.println("O wins!");
        }
        else {
            System.out.println("No winner yet.");
        }
    }
}