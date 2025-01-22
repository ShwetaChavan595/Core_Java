/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". Create an object of the Car class and call both the "drive" and "honk" methods.*/


class Vehicle {
    // Attributes of the Vehicle class
    String brand;
    String model;
    int year;

    // Constructor for Vehicle class
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to drive
    public void drive() {
        System.out.println("The brand of the vehicle is :"+brand);
	System.out.println("The model of the vehicle is :"+model);
	System.out.println("The year of the vehicle is :"+year);
	System.out.println("--------------------------------------");


    }
}

// Child class Car that extends Vehicle
class Car extends Vehicle {
    // Additional attribute specific to Car
    String color;

    // Constructor for Car class
    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);  // Call the constructor of the parent (Vehicle) class
        this.color = color;
    }

    // Method specific to Car
    public void honk() {
	System.out.println("The colour of the vehicle is :"+color);

    }
}

// Main class to test the inheritance and methods
public class Inheritance_Example2 {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car car = new Car("Toyota", "Corolla", 2023, "Red");

        // Call methods from both Vehicle and Car classes
        car.drive();  // Method from Vehicle class
        car.honk();   // Method from Car class
    }
}

//OUTPUT 
c:\PROGRAMS>java Inheritance_Example2
The brand of the vehicle is :Toyota
The model of the vehicle is :Corolla
The year of the vehicle is :2023
--------------------------------------
The colour of the vehicle is :Red
 