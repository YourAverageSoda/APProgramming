package Unit02;

import java.text.DecimalFormat;

/*
Author: Andy Zheng
Date Created 12/16/16
*/
public class powerRounding {
    public static void main(String[] args) {
        double kiseki = 3.45, akagami = 4.56, nayuGorou;
        DecimalFormat kanouSekaiRon = new DecimalFormat("###.#");
        nayuGorou = (Math.pow(kiseki, akagami));
        System.out.println(kanouSekaiRon.format(nayuGorou));
    }
}
