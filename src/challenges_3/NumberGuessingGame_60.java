package challenges_3;

import java.util.Scanner;

public class NumberGuessingGame_60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do{
            System.out.println("Please enter guess number: ");
            number = input.nextInt();

        }while(isNumberMatch(number) != number);

        System.out.println("Number Match!!!");
    }

    public static int isNumberMatch(int num){
        return 6;
    }
}
