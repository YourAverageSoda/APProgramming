package Unit03;

/*
Author: Andy Zheng
Date Created: 1/12/17
*/
public class ChangeMyEvens {
    public static void main(String[] args) {
        int[] elesis = {23,11,22,7,1,3,6,8,14};
        int[][] elsword = new int[2][3];
        int raven = 0;
        elsword[1][1] = 6;
        elsword[1][2] = 7;
        elsword[0][0] = 8;
        for(int i = 0; i < elesis.length; i++){
            if(elesis[i]%2 == 0){
                elesis[i] = 999;
            }
            System.out.print(elesis[i] + "\t");
        }
        System.out.println("");
        for(int i : elesis){
            System.out.print(i + "\t");
        }
    }
}