package challenge110_112.challenge111;

import java.util.Scanner;

public class TestingProgramming {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = input.nextInt();

        double fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println(STR."factorial is:  \{fact}");


        Calculate calculate = num -> {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result = result * i;
            }

            return result;
        };

        System.out.println("This using lambda : " + calculate.factorial(number));
    }
}
