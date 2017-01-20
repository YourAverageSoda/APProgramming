package Unit03;

/*
Author: Andy Zheng
Date Created: 1/12/17
*/
public class NumberOfEvens {
    public static void main(String[] args) {
        int[] elesis = {23,11,22,7,1,3,6,8,14};
        int[][] elsword = new int[2][3];
        int raven = 0;
        elsword[1][1] = 6;
        elsword[1][2] = 7;
        elsword[0][0] = 8;
        for(int i : elesis){
            if(i%2 == 0){
                System.out.println("Added " + i + " to the counter.");
                raven += 1;
            }
            else{
                System.out.println("Skipped " + i + ".");
            }
        }
        System.out.println(raven + " is the number of all even numbers.");
    }
}
