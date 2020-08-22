package com.example.galel.sudoku;

public class SudokuPuzzle {
    int[][] board;
    int x04;
    int x11;
    int x28;
    int x32;
    int x43;
    int x57;
    int x66;
    int x75;
    int x80;


    public SudokuPuzzle() {
        x04 = 0;
        x11 = 0;
        x28 = 0;
        x32 = 0;
        x43 = 0;
        x57 = 0;
        x66 = 0;
        x75 = 0;
        x80 = 0;
        board = new int[9][9];

    }

    public int[][] puzzle(){
        x04 = (int) (Math.random() * 9) + 1;
        x11 = (int) (Math.random() * 9) + 1;
        x28 = (int) (Math.random() * 9) + 1;
        x32 = (int) (Math.random() * 9) + 1;
        x43 = (int) (Math.random() * 9) + 1;
        x57 = (int) (Math.random() * 9) + 1;
        x66 = (int) (Math.random() * 9) + 1;
        x75 = (int) (Math.random() * 9) + 1;
        x80 = (int) (Math.random() * 9) + 1;
        board[0][4] = x04;
        board[1][1] = x11;
        board[2][8] = x28;
        board[3][2] = x32;
        board[4][3] = x43;
        board[5][7] = x57;
        board[6][6] = x66;
        board[7][5] = x75;
        board[8][0] = x80;

        Sudoku game = new Sudoku(board);
        int[][] temp = game.solve();
        int[][] newBoard = new int[9][9];
        int count = 0;
        while(count != 25){
            int i = (int)(Math.random()*8)+1;
            int j = (int)(Math.random()*8)+1;
            if(newBoard[i][j] == 0){
                newBoard[i][j] = temp[i][j];
                count++;
            }
        }
        return newBoard;
    }
}