package Unit05;

import java.util.ArrayList;

/*
Author: Andy Zheng
Date Created: 2/8/17
*/
public class Checking extends Account{
    double balance;
    ArrayList<Double> checks;
    public Checking(){
        checks = new ArrayList();
        for(double i =0; i < 20000; i++){
            checks.add(i);
        }
        checks.add(0.0);
        balance = 0;
    }
    public void deposit(double a){
        balance += a;
    }
    public void withdraw(double a){
        balance -= a;
    }
    public void earnInterest(){
        this.balance *= 1.001;
    }
    public void enterAccountInfo(int a, String b, String c, double d){
        this.number = a;
        this.name = b;
        this.password = c;
        this.balance = d;
    }
    @Override
    public int getAccountNumber(){
        return this.number + 888000000;
    }
    public void writeCheck(double a){
        checks.set((int)(a), a);
        balance -= a;
    }
    public double checkLookUp(int a){
        return checks.get(a);
    }
}
