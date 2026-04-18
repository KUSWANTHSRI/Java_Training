package org.example.Inheritance;

import org.example.Inheritance.Vehicles;


class Truck extends Vehicles{
    int loadCapacity;
    // Constructor
    Truck(String brand, String model, String color, double price, int loadCapacity) {
        super(brand, model, color, price);
        this.loadCapacity = loadCapacity;
    }
    // Overriding Method
    @Override
    void displayInfo() {
        super.displayInfo(); // calling parent method
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
    void loadGoods() {
        System.out.println("Truck is loading goods...");
    }
    void unloadGoods() {
        System.out.println("Truck is unloading goods...");
    }
}