package Unit02;

import java.util.Scanner;

/*
Author: Andy Zheng
Date Created: 12/20/16
*/
public class numberGuess {
    public static void main(String[] args) {
        int leon = (int)(Math.random() * 100 + 1);
        int naegi = 0;
        Scanner monokuma = new Scanner(System.in);
        for(int i = 1; naegi != leon; i++){
            System.out.print("What's your guess? ");
            naegi = monokuma.nextInt();
            if(naegi < leon){
                System.out.println("Too low! Try again!");
            } else if(naegi > leon) {
                System.out.println("Too high! Try again!");
            } else{
                System.out.println("Correct!");
                if(i == 1){
                    System.out.println("That took you a single try! Was that lucky or pure skill?!");
                } else if(i == 2){
                    System.out.println("That took you " + i + " tries. Can you get it in " + Math.abs(i-1) + " try?");
                } else{
                    System.out.println("That took you " + i + " tries. Can you get it in " + Math.abs(i-1) + " tries?");
                }
            }
        }
    }
}
