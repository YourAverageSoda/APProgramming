package Unit02;

import java.text.DecimalFormat;

/*
Author: Andy Zheng
Date Created 12/16/16
*/
public class summerWages {
    public static void main(String[] args) {
        double bronze = 9.75, silver = 424.25, gold;
        DecimalFormat platinum = new DecimalFormat("$####.##");
        gold = bronze * silver;
        System.out.println("Hourly Wage: " + platinum.format(bronze));
        System.out.println("Hours Worked: " + silver);
        System.out.println("Wages Earned: " + platinum.format(gold));
    }
}
