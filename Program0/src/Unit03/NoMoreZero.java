package Unit03;

/*
Author: Andy Zheng
Date Created: 1/12/17
*/
public class NoMoreZero {
    public static void main(String[] args) {
        int[] elesis = {23,11,22,7,1,3,6,8,14};
        int[][] elsword = new int[2][3];
        int raven = 0;
        elsword[1][1] = 6;
        elsword[1][2] = 7;
        elsword[0][0] = 8;
        for(int i = 0; i < elsword.length; i++){
            for(int j = 0; j < elsword[0].length; j++){
                if(elsword[i][j] == 0){
                    elsword[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < elsword.length; i++){
            for(int j = 0; j < elsword[0].length; j++){
                System.out.print(elsword[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
