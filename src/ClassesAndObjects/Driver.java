package ClassesAndObjects;

public class Driver {

   static int minAgeToDrive = 18;

    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive(){
        return this.age >= minAgeToDrive;
    }

    public static void main(String[] args) {

        Car car = new Car(4,"black",200f,14.5f,7);
        System.out.println(car);
        car.addFuel(6);
        car.drive();
        car.drive();
        car.drive();
        car.addFuel(5);
        car.drive();
        car.drive();
        System.out.println(car.getCurrentFuelLevel());

        Car swift = new Car(4,"red",200f,14.5f,7);
        swift.addFuel(8);
        Car startedCar = swift.start();
        startedCar.drive();

        Car thar = new Car();
        System.out.println(thar);

        Driver myDriver = new Driver();
        myDriver.dateOfLicense  = "01/2/2024";
        System.out.println(minAgeToDrive);// if it static and access in the static method it can be accessible

    }
}
