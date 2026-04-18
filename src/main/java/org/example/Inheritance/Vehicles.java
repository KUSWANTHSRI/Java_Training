package org.example.Inheritance;
class Vehicles {
    int numberOfWheels;
    String brand;
    String model;
    String color;
    double price;
  public   Vehicles(String brand, String model, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;

    }
    void start() {
        System.out.println("Vehicle is starting...");
    }
    void stop() {
        System.out.println("Vehicle is stopping...");
    }

    int getNumberOfWheels(){
      return  numberOfWheels;
    }
    // Common Method 3
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}