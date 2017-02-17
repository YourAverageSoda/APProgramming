package Unit05;

import java.util.Scanner;

/*
Author: Andy Zheng
Date Created: 2/14/17
*/
public class Account {
    int number;
    String name, password;
    public Account(){
        number = 0;
        name = " ";
        password = "XYZ123";
    }
    public void enterAccountInfo(int a, String b, String c){
        this.number = a;
        this.name = b;
        this.password = c;
    }
    public int getAccountNumber(){
        return this.number;
    }
    public String getPassword(){
        return this.password;
    }
    public void changePassword(){
        Scanner chainSmokers = new Scanner(System.in);
        System.out.print("Enter your new password: ");
        String pw = chainSmokers.next();
        System.out.print("Re-enter your new password: ");
        String pw1 = chainSmokers.next();
        if(pw.equals(pw1)){
            this.password = pw;
        }
        else{
            System.out.println("Passwords do not match.");
        }
    }
    public String getName(){
        return this.name;
    }
}
