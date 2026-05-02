package tictactoe;

import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'X', '-', '-'},
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

        System.out.println("Computer selected slot number: " + slot);
        placeMove(row, col, 'O');
    }

    public static void main(String[] args) {
        System.out.println("Before Computer Move:");
        displayBoard();

        computerRandomMove();

        System.out.println("After Computer Move:");
        displayBoard();
    }
}