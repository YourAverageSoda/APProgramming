package Unit03;

import java.util.Scanner;

/*
Author: Andy Zheng
Date Created: 1/12/17*/
public class PairsOfShoes {
    public static void main(String[] args) {
        String[] name;
        int[] shoes;
        Scanner elesis = new Scanner(System.in);
        System.out.print("Input number of relatives: ");
        int elsword = elesis.nextInt();
        name = new String[elsword];
        shoes = new int[elsword];
        for(int i = 0; i < shoes.length; i++){
            System.out.print("Input name of family member: ");
            name[i] = elesis.next();
            System.out.print("Input number of shoes owned: ");
            shoes[i] = elesis.nextInt();
        }
        int shoeTotal = 0;
        System.out.println("Here are the results for your family:");
        for(int i = 0; i < elsword; i++){
            System.out.println(name[i] + "\t" + shoes[i]);
            shoeTotal += shoes[i];
        }
        System.out.println("Your family owns a total of " + shoeTotal + "shoes.");
    }
}
