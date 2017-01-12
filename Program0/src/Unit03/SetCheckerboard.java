package Unit03;

/*
Author: Andy Zheng
Date Created 1/11/17
*/
public class SetCheckerboard {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        for(int i = 0; i < board.length; i++){
            for(int a = 0; a < board.length; a++){
                if(a%2 != 0 && ((i%2 == 0) && i < 3)){
                    board[a][i] = 1;
                } else if(a%2 == 0 && ((i%2 != 0) && i < 3)){
                    board[a][i] = 1;
                } else if(a%2 != 0 && (i%2 == 0) && i > 4){
                    board[a][i] = 2;
                } else if(a%2 == 0 && (i%2 != 0) && i > 4){
                    board[a][i] = 2;
                } else{
                    board[a][i] = 0;
                }
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

