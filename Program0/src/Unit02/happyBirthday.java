package Unit02;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Author: Andy Zheng
Date Created: 12/19/16
*/
public class happyBirthday {
    public static void main(String[] args) {
        Scanner chiaki = new Scanner(System.in);
        DecimalFormat mixi = new DecimalFormat("00");
        System.out.print("What's your name? ");
        String lily = chiaki.next();
        System.out.print("What month were you born in? ");
        String danganronpa = chiaki.next();
        int yume = 0;
        switch(danganronpa.toString().toLowerCase()) {
            case "january":
                yume = 1;
                break;
            case "1":
                yume = 1;
                break;
            case "february":
                yume = 2;
                break;
            case "2":
                yume = 2;
                break;
            case "march":
                yume = 3;
                break;
            case "3":
                yume = 3;
                break;
            case "april":
                yume = 4;
                break;
            case "4":
                yume = 4;
                break;
            case "may":
                yume = 5;
                break;
            case "5":
                yume = 5;
                break;
            case "june":
                yume = 6;
                break;
            case "6":
                yume = 6;
                break;
            case "july":
                yume = 7;
                break;
            case "7":
                yume = 7;
                break;
            case "august":
                yume = 8;
                break;
            case "8":
                yume = 8;
                break;
            case "september":
                yume = 9;
                break;
            case "9":
                yume = 9;
                break;
            case "october":
                yume = 10;
                break;
            case "10":
                yume = 10;
                break;
            case "november":
                yume = 11;
                break;
            case "11":
                yume = 11;
                break;
            case "december":
                yume = 12;
                break;
            case "12":
                yume = 12;
                break;
            default:
                System.out.println("I'm sorry, please try again.");
                break;
        }
        System.out.print("What day were you born on? ");
        int grimgar = chiaki.nextInt();
        System.out.print("What year were you born on? ");
        int mary = chiaki.nextInt();
        if(lily.toLowerCase().matches("lily") && yume == 12 && grimgar == 19 && mary == 2000){
            System.out.println("Happy Birthday, Lily!");
        }
        else {
            System.out.println("Happy Birthday to " + lily.replaceFirst(lily.substring(0,1), lily.substring(0,1).toUpperCase()) + " on: " + mixi.format(yume) + "/" + mixi.format(grimgar) + "/" + mixi.format(mary));
        }
    }
}
