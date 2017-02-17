package Unit05;

/*
Author: Andy Zheng
Date Created: 2/10/17
*/
public class VehicleMain {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        veh.on();
        System.out.println("Speed is: " + veh.getSpeed());
        veh.off();
        System.out.println("\n\n");
        Car car = new Car(2014, "Toyota", "Carolla");
        car.on();
        System.out.println("Speed is: " + car.getSpeed());
        for(int i = 0; i < 5; i++){
            car.speedUp();
        }
        System.out.println("Speed is: " + car.getSpeed());
        car.slowDown();
        System.out.println(car.getSpeed());
        car.getVehicle();
        car.off();
        Bike bike = new Bike("Mountain");
        bike.on();
        System.out.println("Speed is: " + bike.getSpeed());
        bike.speedUp();
        bike.speedUp();
        bike.slowDown();
        System.out.println("Speed is: " + bike.getSpeed());
        System.out.println("Type of bike: " + bike.type);
        bike.off();
    }
}
