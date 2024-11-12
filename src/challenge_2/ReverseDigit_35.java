package challenge_2;

import java.util.Scanner;

public class ReverseDigit_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:---> ");
        int number = input.nextInt();
        int result  =ReverseDigit(number);
        System.out.println("Reverse Digit "+ result);
    }
    public static int ReverseDigit(int num){
        int newNum = 0;
        while(num > 0){
            int digit  = num %10;
            newNum = (newNum * 10) + digit;
            num = num/10;
        }
        return newNum;
    }
}
