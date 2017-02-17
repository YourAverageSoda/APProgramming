package Unit05;

/*
Author: Andy Zheng
Date Created: 2/8/17
*/
public class Shark extends Fish{
    public boolean attack;
    public Shark(){
        attack = false;
    }
    public void changeAttack(){
        attack = !attack;
    }
    public boolean isAttacking(){
        return attack;
    }
}
