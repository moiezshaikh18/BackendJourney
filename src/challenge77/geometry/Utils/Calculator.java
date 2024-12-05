package challenge77.geometry.Utils;

import challenge77.geometry.Circle;
import challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rectangle=new Rectangle(10,5);


        double cir_area = (Math.PI *circle.radius*circle.radius);
        double rect_area = rectangle.height * rectangle.base;

        System.out.printf("Area of the circle is:%f,Area of Rectangle Of is: %f",cir_area,rect_area);
    }
}
