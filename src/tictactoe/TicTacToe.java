package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
                {'X', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        if (board[row][col] == '-') {
            board[row][col] = 'O';
            System.out.println("Move placed.");
        } else {
            System.out.println("Already occupied.");
        }

        System.out.println("Board now:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}