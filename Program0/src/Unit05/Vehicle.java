package Unit05;

/*
Author: Andy Zheng
Date Created: 2/10/17
*/
public class Vehicle {
    public int speed;
    public Vehicle(){
        speed = 0;
    }
    public void on(){
        System.out.println("Vehicle is running...");
    }
    public void off(){
        System.out.println("Vehicle is off...");
    }
    public int getSpeed(){
        return speed;
    }
}
