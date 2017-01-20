package Unit03;

import java.util.ArrayList;
import java.util.Scanner;

/*
Author: Andy Zheng
Date Created: 1/18/17
*/
public class myArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> lily = new ArrayList();                               //1
        Scanner lilyLessThanThree = new Scanner(System.in);
        System.out.println("LoL(League of Legends) or osu!?");                  //2
        lily.add(lilyLessThanThree.nextLine());                                 //3
        if(lily.get(0).toUpperCase().matches("LOL")){
            System.out.println("Twisted Treeline, Howling Abyss, or Summoners Rift?");
            lily.add(lilyLessThanThree.nextLine());
            if(!lily.get(1).toUpperCase().matches("SUMMONERS RIFT") && !lily.get(1).toUpperCase().matches("SUMMONER'S RIFT")){
                System.out.println("That's too bad. Summoner's Rift is always the answer");
                lily.set(1, "Summoner's Rift");                                 //5
            }
            System.out.println("Keyboard or mouse?");
            lily.add(lilyLessThanThree.nextLine());
            if(lily.get(2).toUpperCase().matches("BOTH")){                      //6
                System.out.println("Too Bad, you can only choose one.");
                lily.remove(2);                                                 //4
            }
        }
        else{
            System.out.println("Keyboard or mouse?");
            lily.add(lilyLessThanThree.nextLine());
            System.out.println("Fill in the Blank. \"Click the ____.\"");
            lily.add(lilyLessThanThree.nextLine());
            if(lily.get(2).toUpperCase().matches("CIRCLES")){
                System.out.println("Correct :D");
            }
            else{
                System.out.println("THE ANSWER IS CIRCLES >:L");
            }
        }
        int tabletMasterRace = 0;
        for(String i : lily){                                                   //8&9
            System.out.print(i);
            if(i.toUpperCase().matches("TABLET")){
                System.out.print("\t\t\tI use tablets too :D");
                tabletMasterRace = 11037;
            }
            System.out.println();
        }
        if(tabletMasterRace != 11037){
            System.out.println("This Array Was Created With the Blood of " + lily.size() + " AFK Mid Laners.");
        }
        else{
            System.out.println("This Array Was Created With the Sacrifice of " + lily.size() + " Lost Pens.");      //7
        }
    }
}
