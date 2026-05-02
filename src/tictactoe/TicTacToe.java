package tictactoe;

public class TicTacToe {

    static char[][] board = {
        {'X', 'O', 'X'},
        {'X', 'O', 'O'},
        {'O', 'X', 'X'}
    };

    public static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWin(char symbol) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == symbol &&
                board[1][j] == symbol &&
                board[2][j] == symbol) {
                return true;
            }
        }

        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public static boolean checkDraw() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        if (!checkWin('X') && !checkWin('O')) {
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
        else if (checkDraw()) {
            System.out.println("Game Draw!");
        }
        else {
            System.out.println("Game still running.");
        }
    }
}