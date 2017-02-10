package Unit05;

/*
Author: Andy Zheng
Date Created: 2/8/17
*/
public class Animal {
    public boolean living, awake;
    public String color;
    public Animal(){
        living = true;
        awake = false;
        color = " ";
    }
    public void setColor(String a){
        color = a;
    }
    public String getColor(){
        return color;
    }
    public void wakeUp() {
        awake = true;
    }
    public void goToSleep(){
        awake = false;
    }
    public void getSleepStatus(){
        if(this.awake == true){
            System.out.println("This animal is awake!");
        }
        else {
            System.out.println("This Animal is asleep.");
        }
    }
    public void death(){
        living = false;
    }
    public boolean getLivingStatus(){
        return living;
    }
}
