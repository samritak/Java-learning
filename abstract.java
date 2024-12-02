public abstract class Vehicle {
 private String brand;
 // Constructor
 public Vehicle(String brand) {
 this.brand = brand;
 }
 // Abstract method (no implementation)
 public abstract void startEngine();
 // Concrete method
 public void displayBrand() {
 System.out.println("Brand: " + brand);
 }
}

 //Subclass that extends the abstract class
public class Car extends Vehicle {
 public Car(String brand) {
 super(brand);
 }
 @Override
 public void startEngine() {
 System.out.println("The car's engine is starting.");
 }
}
