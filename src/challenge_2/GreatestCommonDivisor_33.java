package challenge_2;

import java.util.Scanner;

public class GreatestCommonDivisor_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1:---> ");
        int number1 = input.nextInt();
        System.out.print("Enter Number 2:---> ");
        int number2 = input.nextInt();
        int gcd = GreatestCommonDivisor(number1,number2);
        System.out.println("GCD for two number is :---> "+gcd);
    }

    public static int GreatestCommonDivisor(int num,int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num,num2);
        while(i<=least){
            if(num%i==0 && num2%i==0){
                gcd = i;
            }
            i++;
        }
        return gcd;


    }

    public static int least(int num1 , int num2){
        return Math.min(num1, num2);
    }
}
