package com.company;
/**
 * board for chess is 8x8 64 tiles total
 * todo display the board
 */

public class Board {
private String[][] chessBoard = new String[8][8];
    public Board() {
        //now fill board
        for(int column = 0; column < 8; column++) {
            for( int row = 0; row < 8; row++ ){
                if(row % 2 ==0) {
                    chessBoard[column][row] = "*";
                } else {
                    chessBoard[column][row] = "-";
                }
            }
        }
    }

    /**
     * method displays the current board status
     */
    public void display() {
        for(int column = 0; column < 8; column++) {
            for( int row = 0; row < 8; row++ ){
                System.out.print(chessBoard[column][row]);
            }
            System.out.println("");
        }
    }

    public void insert(int row, int col, String input) {
        chessBoard[row][col] = input;
    }








}
