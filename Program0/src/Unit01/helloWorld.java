package Unit01;

/*  Author: Andy Zheng
    Date Created: 12/06/16
 */
public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World.");
        System.out.println("123");
        System.out.println("My name is \"Me\".\n");
        for(int i = 0; i < 3; i++) {
            System.out.println("#####\t\t\t#####");
        }
        for(int i = 0; i < 2; i++) {
            System.out.println("");
        }
        System.out.println("#####\t\t\t#####");
        for(int i = 0; i < 1; i++){
            System.out.print(" #######\t     #######\n   ");
            for(int x = 0; x < 23; x++) {
                System.out.print("#");
            }
            System.out.print("\n       ");
            for(int x = 0; x < 15; x++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
