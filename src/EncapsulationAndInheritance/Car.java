package EncapsulationAndInheritance;

public class Car {
    public String color;
    public String model;
    private double fuel_level;
    long cost_of_purchase;


    public Car(){

    }

    public Car(String color, String model, double fuel_level, long cost_of_purchase) {
        this.color = color;
        this.model = model;
        this.fuel_level = fuel_level;
        this.cost_of_purchase = cost_of_purchase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuel_level=").append(fuel_level);
        sb.append(", cost_of_purchase=").append(cost_of_purchase);
        sb.append('}');
        return sb.toString();
    }
}
