package challenge_2;

import java.util.Scanner;

public class Palindrome_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:---> ");
        int number = input.nextInt();
        boolean result  =isPalindrome(number);
        System.out.println("Armstrong "+ result);
    }

    public static boolean isPalindrome(int num){
        int originalCopy  = num;
        int newNum = 0;
        while(num>0){
            int digit = num % 10;
            newNum = (newNum *10)+digit;
            num = num/10;
        }

        return originalCopy == newNum;
    }
}
