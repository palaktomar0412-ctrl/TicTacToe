package tictactoe;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        placeMove(1, 1, 'X');

        System.out.println("Updated Board:");
        displayBoard();
    }
}