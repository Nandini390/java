class Vehicle {
    void start() {
        System.out.println("The vehicle is starting.");
    }
}

// Intermediate class
class Car extends Vehicle {
    void drive() {
        System.out.println("The car is driving.");
    }
}

// Subclass
class ElectricCar extends Car {
    void charge() {
        System.out.println("The electric car is charging.");
    }
}
public class question_13_2 {
    public static void main(String[] args){
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.start();
        myElectricCar.drive();
        myElectricCar.charge();
    }
}
