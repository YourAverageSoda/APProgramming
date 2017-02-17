package Unit05;

/*
Author: Andy Zheng
Date Created: 2/10/17
*/
public class Bike extends Vehicle{
    public String type;
    public Bike(String a){
        super();
        type = a;
    }
    public void speedUp(){
        speed += 3;
    }
    public void slowDown(){
        if(speed > 4){
            speed -= 5;
        }
        else{
            speed = 0;
        }
    }
    public void getVehicle(){
        System.out.println(type);
    }
    @Override
    public void on(){
        System.out.println("Zoom zoom~!");
    }
    public void off(){
        System.out.println("Zoom zoom zoom?");
    }
}
