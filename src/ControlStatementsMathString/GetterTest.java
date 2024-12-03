package ControlStatementsMathString;

import EncapsulationAndInheritance.getterandsetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red","swift",15,7000);
        car.setColor("blue");
        System.out.printf("%s","%s",car.getColor(),car.getModel());
    }
}
