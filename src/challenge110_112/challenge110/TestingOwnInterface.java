package challenge110_112.challenge110;

import java.util.Scanner;

public class TestingOwnInterface {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = input.nextInt();

        Candidate candidate = num -> {
            for (int i = 2; i < num / 2; i++) {
                if (num % 2 == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(candidate.isPrimeNumber(number));
    }
}
