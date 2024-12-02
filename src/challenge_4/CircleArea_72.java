package challenge_4;

import java.util.Scanner;

public class CircleArea_72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("Enter the radius of circle::");
        double radius = input.nextDouble();

        double area = PI * radius * radius;

        System.out.println("Area of circle is::" + area);
    }
}
