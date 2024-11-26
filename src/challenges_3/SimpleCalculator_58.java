package challenges_3;

import java.util.Scanner;

public class SimpleCalculator_58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;
        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;

            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;

            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;

            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }

    }
}
