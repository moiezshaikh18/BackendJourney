package challenge_4;

import java.util.Scanner;

public class RandomNumberGuess_74 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int random_number =32;
        System.out.println("Guess a number between 0 and 50");
        int guess;
        do {
                System.out.println("Please enter the guess number:: ");
                guess = input.nextInt();
        }while(random_number != guess );

        System.out.println("You got it " + guess);
    }
}
