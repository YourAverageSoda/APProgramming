package Unit01;

/*
Author: Andy Zheng
Date Created: 12/08/16
 */
public class myExamAverages {
    public static void main(String[] args) {
        int ex1 = 86, ex2 = 77, ex3 = 88;
        int ex4 = 71, ex5 = 92, ex6 = 88;
        double sum = (double)(ex1 + ex2 + ex3 + ex4 + ex5 + ex6);
        double average0 = (sum / 6.0);
        double average1 = (int)(average0 * 10 + .5);
        double average2 = (int)(average0 * 100 + .5);
        int roundedSum0 = (int)(average0 + .5);
        double roundedSum1 = (average1 / 10.0);
        double roundedSum2 = (average2 / 100.0);
        System.out.print("Avg rounded to nearest percent: " + roundedSum0);
        System.out.print("\nAvg rounded to one decimal place: " + roundedSum1);
        System.out.print("\nAvg rounded to two decimal places: " + roundedSum2);
    }
}
