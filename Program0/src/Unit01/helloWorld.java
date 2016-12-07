package Unit01;

/*  Author: Andy Zheng
    Date Created: 12/06/16
 */
public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World.");
        System.out.println("123");
        System.out.println("My name is \"Me\".\n");
        String charUsed = "*";
        for(int i = 0; i < 3; i++) {
            System.out.println(charUsed + charUsed + charUsed + charUsed + charUsed + "\t\t\t" + charUsed + charUsed + charUsed + charUsed + charUsed);
        }
        for(int i = 0; i < 2; i++) {
            System.out.println("");
        }
        System.out.println((charUsed + charUsed + charUsed + charUsed + charUsed) + "\t\t\t" + (charUsed + charUsed + charUsed + charUsed + charUsed));
        for(int i = 0; i < 1; i++){
            System.out.print(" " + (charUsed + charUsed + charUsed + charUsed + charUsed + charUsed + charUsed) + "\t     " + (charUsed + charUsed + charUsed + charUsed + charUsed + charUsed + charUsed) + "\n   ");
            for(int x = 0; x < 23; x++) {
                System.out.print(charUsed);
            }
            System.out.print("\n       ");
            for(int x = 0; x < 15; x++) {
                System.out.print(charUsed);
            }
            System.out.println("");
        }
    }
}
