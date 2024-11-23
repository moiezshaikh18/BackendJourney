package ClassesAndObjects;

public class Car {

    static int noOfcarSold ;

    int numberOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;

    static {
        noOfcarSold = 0;
        System.out.println("I am the static block "+ noOfcarSold);
    }

    {
        noOfcarSold++;
        System.out.println("I am the init block "+ noOfcarSold);
    }

     Car(int numberOfWheels, String color, float maxSpeed, float currentFuelInLiters, int noOfSeat) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentFuelInLiters = currentFuelInLiters;
        this.noOfSeat = noOfSeat;
    }

    Car() {
        this.numberOfWheels = 4;
        this.color = "red";
        this.maxSpeed = 200;
        this.currentFuelInLiters = 14.5f;
        this.noOfSeat = 7;
    }

    Car(float max){
         this(4,"White",max,15.5f,10);
    }

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

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Im in finalize");
//    }

    public static void main(String[] args) {

//        Car car;//reference

    }
}
