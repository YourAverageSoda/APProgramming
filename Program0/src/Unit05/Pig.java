package Unit05;

/*
Author: Andy Zheng
Date Created: 2/8/17
*/
public class Pig extends Animal{
    public boolean oinking;
    public Pig(){
        super();
        oinking = false;
    }
    public void makeOink(){
        oinking = true;
    }
    public void stopOink(){
        oinking = false;
        super.goToSleep();
    }
    public boolean getOinkStatus(){
        return oinking;
    }
}
