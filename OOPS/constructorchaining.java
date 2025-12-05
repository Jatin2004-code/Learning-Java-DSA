package OOPS;
class Car {
    Car() {
        this(100);  // calling parameterized constructor
        System.out.println("Default Constructor");
    }

    Car(int speed) {
        System.out.println("Speed Constructor: " + speed);
    }
}

public class constructorchaining {
   public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Car object created: " + c);
    }
}
