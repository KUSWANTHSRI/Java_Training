package org.example.Interface;



public class Main {
    public static void main(String[] args) {

        // Creating objects
        Car car = new Car("Toyota", "Innova", "White", 2000000, true);
        Bike bike = new Bike("Yamaha", "R15", "Blue", 180000, true);
        Truck truck = new Truck("Tata", "Ace", "Yellow", 500000, 3);

        //  Car Execution
        System.out.println("----- CAR -----");
        car.start();
        car.displayInfo();
        car.playMusic();
        car.openSunroof();

        // Bike Execution
        System.out.println("\n----- BIKE -----");
        bike.start();
        bike.displayInfo();
        bike.doWheelie();
        bike.checkGear();

        //  Truck Execution
        System.out.println("\n----- TRUCK -----");
        truck.start();
        truck.displayInfo();
        truck.loadGoods();
        truck.unloadGoods();

        //  Polymorphism (Important for Interviews)
        System.out.println("\n----- POLYMORPHISM -----");

        VehicleInterface v1 = car;
        VehicleInterface v2 = bike;
        VehicleInterface v3 = truck;

        v1.start();
        v2.start();
        v3.start();
    }
}