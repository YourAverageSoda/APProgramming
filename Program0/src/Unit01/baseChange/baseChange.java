package Unit01.baseChange;

/*
Author: Andy Zheng
Date Created: 12/13/16
 */
public class baseChange {

    public static void main(String[] args) {
        int baseIn, baseOut;
        int valueIn, valueOut;
        int input;
        utilities util = new utilities();
        System.out.print("Input Original Value: ");
        valueIn = util.getIntIn();
        System.out.print("\nInput Original Base: ");
        baseIn = util.getIntIn();
        System.out.print("\nInput Output Base: ");
        baseOut = util.getIntIn();
        int base10 = util.toNewBase(baseIn, valueIn);
        valueOut = util.toNewBase(base10, baseIn);
        System.out.println("\nYour Value is: ");
    }
}
