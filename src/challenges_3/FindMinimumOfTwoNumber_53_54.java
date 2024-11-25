package challenges_3;

import java.util.Scanner;

public class FindMinimumOfTwoNumber_53_54 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Welcome to minimum number find:::");
        System.out.println("Enter the first number::");
        int number1= input.nextInt();
        System.out.println("Enter the Second number::");
        int number2= input.nextInt();

        int minimumNumber= MinimumNumber(number1,number2);

        System.out.println("Minimum number is:: "+ minimumNumber);

        String isEvenOdd = isEvenOdd(number1);
        System.out.println(isEvenOdd);
    }

    public static int MinimumNumber(int num1,int num2){
        return num1<num2 ? num1:num2;
    }

    public static String isEvenOdd(int num1){
        return num1%2==0 ? "Even":"Odd";
    }
}
