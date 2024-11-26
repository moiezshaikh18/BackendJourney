package ControlStatementsMathString;

import java.util.Scanner;

public class RecursionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to factorial generator");
        System.out.println("enter the number::: ");
        int num = input.nextInt();
        long fact  = factorialIterative(num);
        long fact2  = factorial(num);

        System.out.println("factorial of your number is:: "+fact);

        System.out.println("factorial of your number is (recursion):: "+fact2);
    }

    public static long factorial(int num){
        if(num == 1){
            return  1;
        }
        return  num * factorial(num -1);

    }

    public static int factorialIterative(int num){
        int fact= 1;
        for(int i =2;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
}
