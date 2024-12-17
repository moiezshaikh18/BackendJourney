package AbstractionAndPolymorphism.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {

        Car car = new Car();
//        Vehicle vehicle = new Vehicle();
        Plane plane=new Plane();

//        castTest(vehicle);
        castTest(car);
        castTest(plane);

        Vehicle vCar = new Car();
//        Car cVar =(Car) new Vehicle();

    }

    private static void castTest(Vehicle veh){
        veh.start();
//        Car cVar =(Car) veh;
//        cVar.start();
//        cVar.noOfDoors();

    }
}
