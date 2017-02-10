package Unit05;

/*
Author: Andy Zheng
Date Created: 2/8/17
*/
public class AnimalMain {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println("Animal 1 is alive ..." + a1.living);
        System.out.println("Animal 1 is awake ..." + a1.awake);
        a1.wakeUp();
        System.out.println("Animal 1 is alive ..." + a1.living);
        System.out.println("Animal 1 is awake ..." + a1.awake);
        a1.death();
        System.out.println("Animal 1 is alive ..." + a1.living);
        System.out.println("Animal 1 is awake ..." + a1.awake);
        Pig piggy1 = new Pig();
        piggy1.makeOink();
        piggy1.getSleepStatus();
        piggy1.setColor("bacony");
        System.out.println(piggy1.awake + " " + piggy1.color + " " + piggy1.living + " " + piggy1.oinking + " " + piggy1.getOinkStatus() + " " + piggy1.getColor() + " " + piggy1.getLivingStatus());
        
        Cat cat1 = new Cat();
        cat1.getSleepStatus();
        System.out.println(cat1.awake + " " + cat1.breed + " " + cat1.color + " " + cat1.living + " " + cat1.meowing + " " + cat1.getBreed() + " " + cat1.getColor());
        cat1.setBreed("coin");
        cat1.stopMeow();
        cat1.makeMeow();
        cat1.goToSleep();
        cat1.wakeUp();
        cat1.setColor("red");
        System.out.println(cat1.awake + " " + cat1.breed + " " + cat1.color+ " " + cat1.living + " " + cat1.meowing + " "  + cat1.getBreed() + " " + cat1.getColor());
        Shark shark1 = new Shark();
        shark1.getSleepStatus();
        shark1.fishNoise();
        shark1.swim();
        shark1.death();
        shark1.goToSleep();
        shark1.wakeUp();
        shark1.setColor("red");
        shark1.setType("tiger");
        System.out.println(shark1.awake + " " + shark1.color + " " + shark1.living + " " + shark1.type + " " + shark1.attack + " " + shark1.getColor() + " " + shark1.isAttacking() + shark1.getType());
        Fish fish1 = new Fish();
        System.out.println(fish1.awake + " " + fish1.type + " " + fish1.color + " " + fish1.living + " " + fish1.getType() + " " + fish1.getColor());
        fish1.fishNoise();
        fish1.getSleepStatus();
        fish1.setColor("blue");
        fish1.setType("pipsqueak"); 
        fish1.fishNoise();
        fish1.swim();
    }
}
