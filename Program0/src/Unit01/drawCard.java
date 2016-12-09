package Unit01;

/*
Author: Andy Zheng
Date Created: 12/09/16
 */
public class drawCard {
    public static void main(String[] args) {
        int randomCardNumber;
        randomCardNumber = (int)(Math.random() * 56 + 1);
        System.out.println("Your card was #" + randomCardNumber);
    }
}
