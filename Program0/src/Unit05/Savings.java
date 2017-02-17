package Unit05;

/*
Author: Andy Zheng
Date Created: 2/14/17
*/
public class Savings extends Account{
    double balance;
    public Savings(){
        balance = 0;
    }
    public void deposit(double a){
        this.balance += a;
    }
    public void withdraw(double a){
        this.balance -= a;
    }
    public void enterAccountInfo(int a, String b, String c, double d){
        this.number = a;
        this.name = b;
        this.password = c;
        this.balance = d;
    }
    public void earnInterest(){
        this.balance *= 1.005;
    }
    @Override
    public int getAccountNumber(){
        return this.number + 888000000;
    }
}
