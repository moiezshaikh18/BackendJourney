package challenge_2;

import java.util.Scanner;

public class factorial_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial");
        System.out.print("Enter Number:---> ");
        int number = input.nextInt();
        long fact = factorial(number);
        System.out.println("factorial for " + number + " is " + fact);
    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }

        int i = 1;
        int fact = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}