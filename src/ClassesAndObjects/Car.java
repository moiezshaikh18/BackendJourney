package ClassesAndObjects;

public class Car {
    int numberOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;

//    public Car(int numberOfWheels, String color, float maxSpeed, float currentFuelInLiters, int noOfSeat) {
//        this.numberOfWheels = numberOfWheels;
//        this.color = color;
//        this.maxSpeed = maxSpeed;
//        this.currentFuelInLiters = currentFuelInLiters;
//        this.noOfSeat = noOfSeat;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfWheels=" + numberOfWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentFuelInLiters=" + currentFuelInLiters +
                ", noOfSeat=" + noOfSeat +
                '}';
    }

    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel,can't start");
        } else if (currentFuelInLiters <5) {
            System.out.println("car is in reserved mode get it refuel");
        }else {
            System.out.println("Car is started.....bruhhh....");
        }
        return this;
    }

    public void drive(){
            currentFuelInLiters --;
            System.out.println("Car is driving");
    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters = currentFuelInLiters + this.currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }

    public static void main(String[] args) {

//        Car car;//reference

    }
}
