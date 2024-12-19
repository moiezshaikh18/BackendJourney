package ExceptionAndFileHandling.trycatch;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to division calculator ");
        System.out.println("Please enter your two numbers::");

        int first = input.nextInt();
        int second = input.nextInt();

        try{
            int result = first / second;
            System.out.printf("Result is %d",result);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero please enter valid value.");
        }
    }
}
