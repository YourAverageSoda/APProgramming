package Unit05;

/**
 *
 * @author andy_zheng422
 */
public class Call extends Communicate{
    public boolean callActive;
    public Call(){
        callActive = false;
    }
    public void changeCallStatus(){
        callActive = !callActive;
    }
    @Override
    public void textMe() {
        System.out.println("No text sent, this is a phone call!");
    }

    @Override
    public void callMe() {
        System.out.println("Dialing 555-1234 ... ring ... Hello!");
    }
    
}
