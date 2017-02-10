package Unit04;

import java.util.Scanner;

/*
Author: Andy Zheng
Date Created: 1/27/17
*/
public class BankAccount {
    public static double balance;
    public static String password, username;
    public static Scanner osu = new Scanner(System.in);
    public BankAccount(String theLastGame){
        balance = 0;
        password = "XYZ";
        username = theLastGame;
    }
    public static void main(String[] args) {
        boolean dapple = true;
        System.out.println("Input Username: ");
        BankAccount nayugorou = new BankAccount(osu.next());
        while(dapple){
            int dew = soda();
            switch(dew){
                case 1:
                    nayugorou.editKapi();
                    break;
                case 2:
                    nayugorou.deposit();
                    break;
                case 3:
                    nayugorou.withdraw();
                    break;
                case 4:
                    System.out.println("You have: $" + nayugorou.getBalance());
                    break;
                case 5:
                    System.out.println("Password is :" + nayugorou.getPassword());
                    break;
                case 6:
                    System.out.println("Username is :" + nayugorou.getUsername());
                    break;
                case 7:
                    nayugorou.Username();
                    break;
                default:
                    dapple = false;
                    break;
            }
        }
    }
    public static int soda(){
        System.out.println("What would you like to do?");
        System.out.println("1. Edit Password.");
        System.out.println("2. Deposit Money.");
        System.out.println("3. Withdraw Money.");
        System.out.println("4. Get Current Balance.");
        System.out.println("5. Retrieve Password");
        System.out.println("6. Get Username.");
        System.out.println("7. Change Username.");
        System.out.println("8. Exit Account.");
        int sodaIsDew = osu.nextInt();
        return sodaIsDew;
    }
    public static void editKapi(){
        System.out.print("Type new Password: ");
        String kano = osu.next();
        System.out.print("Retype new Password: ");
        String akagami = osu.next();
        if(verifyKapi(kano, akagami)){
            System.out.println("Password changed.");
            password = kano;
        }
        else{
            System.out.println("No change due to nonmatching passwords.");
        }
    }
    public static boolean verifyKapi(String AKINO, String bless4){
        if(AKINO.matches(bless4)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void deposit(){
        System.out.print("Input deposit amount: ");
        balance += osu.nextDouble();
    }
    public static void withdraw(){
        System.out.print("Input withdrawn amount: ");
        balance -= osu.nextDouble();
    }
    public static double getBalance(){
        return balance;
    }
    public static String getPassword(){
        return password;
    }
    public static String getUsername(){
        return username;
    }
    public static void Username(){
        System.out.print("Input new username: ");
        username = osu.next();
    }
}
