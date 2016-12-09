package Unit01;

/*
Author: Andy Zheng
Date Created: 12/09/16
 */
public class diceRoller {
    public static void main(String[] args) {
        int die1, die2;
        die1 = (int)(Math.random() * 6 + 1);
        die2 = (int)(Math.random() * 8 + 1);
        System.out.println("6-Sided die = " + die1);
        System.out.println("8-Sided die = " + die2);
        System.out.println("Total of dice is " + die1+die2);
    }
}
