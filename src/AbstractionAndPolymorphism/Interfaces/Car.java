package AbstractionAndPolymorphism.Interfaces;


public class Car extends Vehicle {

    private int noOfDoors;

    public Car() {
        super(4);
    }

    public void getSetGo(){
        System.out.println("This is interface method");
    }

    @Override
    public void makeStartSound() {
        System.out.println("Going brummmmmm..... brummmmmm.... interfaces");
    }
}
