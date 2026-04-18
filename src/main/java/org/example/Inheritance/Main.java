package org.example.Inheritance;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car v1 = new Car("Toyota", "Camry", "Black", 3000000,  true);
        Bike v2 = new Bike("Yamaha", "R15", "Blue", 180000,  true);
        Truck v3 = new Truck("Tata", "LPT", "White", 2500000, 40);
        //car details
        System.out.println("Car details ");
        v1.start();
        v1.stop();
        v1.openSunroof();
        v1.playMusic();
        v1.displayInfo();
        System.out.println();
        //bike details
        System.out.println("Bike details");
        v2.checkGear();
        v2.start();
        v2.doWheelie();
        //Truck details
        System.out.println();
        System.out.println("Truck details");
        v3.displayInfo();
        v3.loadGoods();
        v3.unloadGoods();

    }
}