package challenge_2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number:---> ");
        int a = input.nextInt();
        System.out.print("Enter Second Number:---> ");
        int b =input.nextInt();

        System.out.println("+ "+ (a + b));
        System.out.println("- "+(a - b));
        System.out.println("* "+a * b);
        System.out.println("/ " +a / b);
        System.out.println("% " +a % b);
    }
}
