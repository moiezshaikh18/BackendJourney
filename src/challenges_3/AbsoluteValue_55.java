package challenges_3;

import java.util.Scanner;

public class AbsoluteValue_55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Number::");
        System.out.println("Enter the first number::");
        int number  =input.nextInt();
        int result = number>0?number:-number;

        System.out.println("Absolute value is:: "+ result);
    }
}
