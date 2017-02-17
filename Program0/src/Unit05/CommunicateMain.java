package Unit05;

/**
 *
 * @author andy_zheng422
 */
public class CommunicateMain {
    public static void main(String[] args) {
        Text my1stText = new Text();
        Call my1stCall = new Call();
        System.out.println("Text Class ...");
        my1stText.callMe();
        my1stText.textMe();
        System.out.println(" ");
        System.out.println("Call Class ...");
    my1stCall.callMe();
        my1stCall.textMe();
    }
}
