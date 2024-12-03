package EncapsulationAndInheritance;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.model = "Swift";
        car.cost_of_purchase = (long) 78.45; // default access modifier

        System.out.println(car);
        Car newCar = new Car("black","BMW",1,5000);

        System.out.println(newCar);


    }
}
