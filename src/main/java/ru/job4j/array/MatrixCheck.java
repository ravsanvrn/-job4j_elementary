package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        for (int col = 0; col < board[row].length; col++) {
            if (board[row][col] != 'X') {
                return false;
            }
        }
        return true;
    }
}