package Unit05;

/*
Author: Andy Zheng
Date Created: 2/8/17
*/
public class Fish extends Animal{
    public String type;
    public Fish(){
        super();
        type = " ";
    }
    public void setType(String a){
        type = a;
    }
    public String getType(){
        return type;
    }
    public void swim(){
        System.out.println("The fish is swimming.");
    }
    public void fishNoise(){
        System.out.println("*bubbles*");
    }
}
