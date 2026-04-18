package org.example.Interface;

public class Bike implements VehicleInterface {
    boolean hasGear;
    String brand;
    String model;
    String color;
    double price;
    // Constructor
    Bike(String brand, String model, String color, double price, boolean hasGear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.hasGear = hasGear;
    }
    @Override
    public void start() {
        System.out.println("Bike starts with kick or self-start...");
    }
    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
    @Override
    public void displayInfo() {
        System.out.println("Bike Details:");
        System.out.println(brand + " " + model + " " + color + " " + price);
        System.out.println("Has Gear: " + hasGear);
    }
    void doWheelie() {
        System.out.println("Bike is doing a wheelie!");
    }
    void checkGear() {
        System.out.println("Has Gear: " + hasGear);
    }
}