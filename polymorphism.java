public interface Movable {
 void move(); // Abstract method
}
// Implementing the interface in different classes
public class Car implements Movable {
 @Override
 public void move() {
 System.out.println("The car is driving.");
 }
}
public class Bicycle implements Movable {
 @Override
 public void move() {
 System.out.println("The bicycle is pedaling.");
 }
}
public class Main {
 public static void main(String[] args) {
 // Using polymorphism with the Movable interface
 Movable myCar = new Car();
 Movable myBicycle = new Bicycle();
 myCar.move(); // Outputs: The car is driving.
 myBicycle.move(); // Outputs: The bicycle is pedaling.
 }
}
