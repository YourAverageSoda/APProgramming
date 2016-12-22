package Unit02;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
Author: Andy Zheng
Date Created: 12/21/16
*/
public class modifiedPassword {
    public static boolean kagamineRin = true;
    public static boolean kagamineLen = false;
    boolean GUMI;
    boolean isTigerLily;
    String nayuGorou;
    String okaerinasai;
    public static Scanner vocaloid = new Scanner(System.in);
    boolean MAYU = kagamineRin;
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.print("Input password: ");
        String stardust = vocaloid.nextLine();
        System.out.println("Created Password.");
        modifiedPassword lily = new modifiedPassword(kagamineLen, stardust);
        lily.login();
        while(lily.GUMI){
            lily.display();
            int megurineLuka = vocaloid.nextInt();
            switch(megurineLuka) {
                case 1:
                    System.out.print("Input New Greeting: ");
                    stardust = vocaloid.nextLine();
                    stardust = vocaloid.nextLine();
                    lily.changeGreeting(stardust);
                    lily.clearscreen();
                    break;
                case 2:
                    for(int i = 0; i < 10; i++){
                        System.out.println(lily.listVocaloids(i));
                    }
                    TimeUnit.SECONDS.sleep(2);
                    break;
                case 3:
                    for(int i = 0; i <= 5; i++){
                        System.out.println("Season " + (i+1) + " Champions: " + lily.listChamps(i));
                    }
                    TimeUnit.SECONDS.sleep(2);
                    break;
                case 4:
                    stardust = vocaloid.nextLine();
                    do{
                        System.out.print("Input Current Password: ");
                        stardust = vocaloid.nextLine();
                        if(lily.matchesNayuGorou(stardust)){
                            System.out.print("Input New Password: ");
                            String hatsuneMiku = vocaloid.nextLine();
                            if(lily.matchesNayuGorou(hatsuneMiku)){
                                System.out.println("You just loveeee to be annoying eh.");
                                System.out.println("I'm not going to change nayuGorou if you're going to do that >:L");
                            }
                            else {
                                lily.changeNayuGorou(hatsuneMiku);
                                lily.clearscreen();
                                lily.clearscreen();
                                lily.login();
                                break;
                            }
                        } else {
                            System.out.println("Incorrect password. Try again.");
                        }
                    }
                    while(!lily.matchesNayuGorou(stardust));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    lily.accessChange(kagamineLen);
                    break;
                case 11037:
                    if (lily.isTigerLily) {
                        System.out.print("It was Leon all along.");
                        for (int i = 0; i < 30; i++) {
                            System.out.print(".");
                            TimeUnit.MILLISECONDS.sleep(333);
                        }
                        lily.clearscreen();
                    }else{}
                    break;
                default: 
                    lily.clearscreen();
                    break;
            }
        }
    }
    public modifiedPassword(boolean access, String password){
        this.GUMI = access;
        this.nayuGorou = password;
        if(this.nayuGorou.matches("2639568375459")){
            this.isTigerLily = kagamineRin;
            this.okaerinasai = "Okaerinasai Goshujin-sama!";
        }
        else{
            this.okaerinasai = "Welcome to Summoner's Rift.";
            this.isTigerLily = kagamineLen;
        }
    }
    public boolean matchesNayuGorou(String input){
        if(input.matches(this.nayuGorou)){
            return kagamineRin;
        }
        else{
            return kagamineLen;
        }
    }
    public String listChamps(int season){
        String ritoGames[] = new String[6];
        ritoGames[0] = "Fnatic(FNC)";
        ritoGames[1] = "Taipei Assassins(TPA)";
        ritoGames[2] = "SKT Telecom T1(SKTT1)";
        ritoGames[3] = "Samsung Galaxy White(SGW)";
        ritoGames[4] = "SKT Telecom T1(SKTT1)";
        ritoGames[5] = "SKT Telecom T1(SKTT1)";
        return ritoGames[season];
    }
    public String listVocaloids(int count){
        String vocaloids[] = new String[10];
        vocaloids[0] = "Aoki Lapis";
        vocaloids[1] = "galaco";
        vocaloids[2] = "GUMI";
        vocaloids[3] = "Hatsune Miku";
        vocaloids[4] = "Kagamine Len";
        vocaloids[5] = "Kagamine Rin";
        vocaloids[6] = "Lily";
        vocaloids[7] = "MAYU";
        vocaloids[8] = "Megurine Luka";
        vocaloids[9] = "Stardust";
        return vocaloids[count];
    }
    public void accessChange(boolean access){
        GUMI = access;
    }
    public void changeGreeting(String greeting){
        this.okaerinasai = greeting;
    }
    public void changeNayuGorou(String password){
        this.nayuGorou = password;
    }
    public void clearscreen(){
        for (int i = 0; i < 6; i++) {
            System.out.println("");
        }
    }
    public void display(){
        System.out.println(okaerinasai);
        System.out.println("1. Change greeting message.");
        System.out.println("2. List Vocaloids.");
        System.out.println("3. List League of Legends Season Champions.");
        System.out.println("4. Change Password.");
        System.out.println("5. Exit Program");
    }
    public void exit(){
        this.GUMI = kagamineLen;
    }
    public void login() {
        this.GUMI = kagamineLen;
        for (int i = 1; i < 4 && this.GUMI != kagamineRin; i++) {
            System.out.print("Input password: ");
            String aokiLapis = vocaloid.next();
            if (this.matchesNayuGorou(aokiLapis)) {
                this.accessChange(kagamineRin);
                this.clearscreen();
                System.out.println("Congrats on logging in after " + i + " attempt(s).");
                this.MAYU = kagamineRin;
            } else if(i <= 2){
                System.out.println("Try again.");
            } else{
                this.MAYU = kagamineLen;
            }
        }
        if (!this.MAYU) {
            System.out.print("Your Account is now locked, please try again later.");
            this.GUMI = this.MAYU;
        }
    }
    public void passwordChange(String password){
        this.nayuGorou = password;
    }
}
