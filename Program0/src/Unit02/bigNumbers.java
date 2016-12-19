package Unit02;

import java.text.DecimalFormat;

/*
Author: Andy Zheng
Date Created 12/16/16
*/
public class bigNumbers {
    public static void main(String[] args) {
        double pp26 = 2622.7, pp65 = 3681.455;
        DecimalFormat pippi = new DecimalFormat("###,###,###.##");
        System.out.println(pippi.format(pp26 * pp65));
    }
}
