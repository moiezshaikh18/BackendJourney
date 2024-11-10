package challenge_2;

import java.util.Scanner;

public class SumOfDigits_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:---> ");
        int number = input.nextInt();
        int result  =SumOfDigit(number);
        System.out.println("Sum Of Digit(236(2+3+6)) = "+ result);
    }

    public static int SumOfDigit(int num){
        int sum = 0;
        while(num > 0){
                sum  = sum + num %10;
                num = num /10; // For updating the number means 236%10 = 6 to update number 236/10 = 23.6 then 23/10 = 2.3
        }
        return sum;
    }
}
