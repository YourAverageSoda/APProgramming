package Unit05;

/*
Author: Andy Zheng
Date Created: 2/8/17
*/
public class Cat extends Animal{
    public boolean meowing;
    public String breed;
    public Cat(){
        super();
        breed = " ";
        meowing = false;
    }
    public void setBreed(String a){
        breed = a;
    }
    public String getBreed(){
        return breed;
    }
    public void makeMeow(){
        meowing = true;
    }
    public void stopMeow(){
        meowing = false;
    }
    public boolean getMeowStatus(){
        return meowing;
    }
}
