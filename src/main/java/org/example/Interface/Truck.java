package org.example.Interface;

public class Truck implements VehicleInterface {
    int loadCapacity;
    String brand;
    String model;
    String color;
    double price;
    // Constructor
    Truck(String brand, String model, String color, double price, int loadCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void start() {
        System.out.println("Truck started");
    }
    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }
    @Override
    public void displayInfo() {
        System.out.println("Truck Details:");
        System.out.println(brand + " " + model + " " + color + " " + price);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
    void loadGoods() {
        System.out.println("Truck is loading goods...");
    }
    void unloadGoods() {
        System.out.println("Truck is unloading goods...");
    }
}