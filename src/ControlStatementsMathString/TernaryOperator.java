package ControlStatementsMathString;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number::");
        int number  =input.nextInt();
        System.out.println("Enter the second number::");
        int number2  =input.nextInt();

        int maxNumber = number > number2 ? number :number2;

        System.out.println("maximum number is::"+maxNumber);
    }
}
