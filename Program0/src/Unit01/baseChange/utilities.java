package Unit01.baseChange;

import java.util.Scanner;

/*
Author: Andy Zheng
Date Created: 12/13/16
 */
public class utilities {
    
    public utilities() {
        Scanner input = new Scanner(System.in);
    }
    
    int getIntIn(){   
        Scanner input = new Scanner(System.in);
        int inputI = input.nextInt();
        return inputI;
    }

    int toDecimal(int origBase, int origValue){
        int outputValue;
        int base10 = 0;
        int origBaseIn = origBase;
        int origValueIn = origValue;
        int remainder = 0;
        for(int i = 0; remainder != 0; i++) {
            remainder = (int) (origValueIn % Math.pow(origBaseIn, i));
            base10 = (int) (Math.pow(10, i)) * origBaseIn;
        }
        outputValue = base10;
        return outputValue;
    }
    int toNewBase(int decimalValue, int newBase){
        int outValue = 0;
        int remainder = 0;
        for(int i = 0; remainder != 0; i++) {
            remainder = (int) (decimalValue % Math.pow(newBase, i));
            outValue = (int) (Math.pow(10, i)) * newBase;
        }
        return outValue;
    }
}
