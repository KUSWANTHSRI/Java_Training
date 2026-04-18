package org.example.Interface;
public class Car implements VehicleInterface {
    boolean hasSunroof;
    String brand;
    String color;
    String model;
    double price;
    // Constructor
    Car(String brand, String model, String color, double price, boolean hasSunroof) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.hasSunroof = hasSunroof;
    }
    @Override
    public void start() {
        System.out.println("Car started");
    }
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
    @Override
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println(brand + " " + model + " " + color + " " + price);
        System.out.println("Sunroof: " + hasSunroof);
    }
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