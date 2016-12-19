package Unit02;

import java.util.Scanner;

/*
Author: Andy Zheng
Date Created: 12/19/16
*/
public class myFirstCalculator {
    public static void main(String[] args) {
        int pp1, pp2;
        Scanner pippi = new Scanner(System.in);
        System.out.print("Input integer: ");
        pp1 = pippi.nextInt();
        System.out.print("Input integer: ");
        pp2 = pippi.nextInt();
        System.out.println(pp1 + " + " + pp2 + " = " + (pp1 + pp2));
        System.out.println(pp1 + " - " + pp2 + " = " + (pp1 - pp2));
        System.out.println(pp1 + " * " + pp2 + " = " + (pp1 * pp2));
        System.out.println(pp1 + " / " + pp2 + " = " + ((double)(pp1) / pp2));
    }
}
