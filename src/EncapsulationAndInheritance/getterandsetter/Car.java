package EncapsulationAndInheritance.getterandsetter;

public class Car {
    private String color;
    private String model;
    private double fuel_level;
    private long costOfPurchase;

    public Car(String color, String model, double fuel_level, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuel_level = fuel_level;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel(){
        return model;
    }
}
