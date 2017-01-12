package Unit03;

/*
Author: Andy Zheng
Date Created 1/11/17
*/
public class BlankCheckerBoard {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        for(int i = 0; i < board.length; i++){
            for(int a = 0; a < board.length; a++){
                board[i][a] = 0;
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int a = 0; a < board.length; a++){
                System.out.print(board[a][i] + " ");
            }
            System.out.println("");
        }
    }
}
