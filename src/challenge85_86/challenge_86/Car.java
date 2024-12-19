package challenge85_86.challenge_86;

public class Car extends Vehicle {
    public void service(){
        super.service();
        System.out.println("Car is getting service...");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.service();
    }
}
