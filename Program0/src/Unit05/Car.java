package Unit05;

/*
Author: Andy Zheng
Date Created: 2/10/17
*/
public class Car extends Vehicle{
    public int year;
    public String make, model;
    public Car(int a, String b, String c){
        super();
        year = a;
        make = b;
        model = c;
    }
    public void speedUp(){
        speed += 8;
    }
    public void slowDown(){
        if(speed >= 11){
            speed -= 11;
        }
        else{
            speed = 0;
        }
    }
    public void getVehicle(){
        System.out.println(year + " " + make + " " + model + ".");
    }
}
