package ControlStatementsMathString;

public class ToStringExample {

    String car_name;
    String color;
    int number_of_doors;

     ToStringExample(String car_name, String color, int number_of_doors) {
        this.car_name = car_name;
        this.color = color;
        this.number_of_doors = number_of_doors;
    }

    @Override
    public String toString() {
        return "ToStringExample{" +
                "car_name='" + car_name + '\'' +
                ", color='" + color + '\'' +
                ", number_of_doors=" + number_of_doors +
                '}';
    }

    public static void main(String[] args) {
        ToStringExample swift = new ToStringExample("Swift","red",4);
        System.out.println(swift);
    }
}
