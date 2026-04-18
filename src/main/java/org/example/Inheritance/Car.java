package org.example.Inheritance;
class Car extends Vehicles {
    boolean hasSunroof;
    // Constructor
    Car(String brand, String model, String color, double price, boolean hasSunroof) {
        super(brand, model, color, price); // calling parent constructor
        this.hasSunroof = hasSunroof;
    }

    void start() {
        System.out.println("Car starts with push button...");
    }
    // Unique Methods
    void playMusic() {
        System.out.println("Car is playing music...");
    }
    void openSunroof() {
        if (hasSunroof)
            System.out.println("Sunroof opened!");
        else
            System.out.println("No sunroof available.");
    }
}