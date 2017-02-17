package Unit05;

/*
Author: Andy Zheng
Date Created: 2/15/17
*/
public class Text extends Communicate{
    public boolean texting;
    public Text(){
        texting = false;
    }
    public void changeTextStatus(){
        texting = !texting;
    }
    @Override
    public void textMe() {
        System.out.println("will b L8");
    }

    @Override
    public void callMe() {
        System.out.println("No call made, this is a text!");
    }
    
}
