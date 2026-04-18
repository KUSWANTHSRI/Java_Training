package org.example.Inheritance;



class Bike extends Vehicles {

    boolean hasGear;

    // Constructor
    Bike(String brand, String model, String color, double price, boolean hasGear) {
        super(brand, model, color, price);
        this.hasGear = hasGear;
    }

    // Overriding Method
    @Override
    void start() {
        System.out.println("Bike starts with kick or self-start...");
    }

    // Unique Methods
    void doWheelie() {
        System.out.println("Bike is doing a wheelie!");
    }

    void checkGear() {
        System.out.println("Has Gear: " + hasGear);
    }
}