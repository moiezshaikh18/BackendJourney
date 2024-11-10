package challenge_2;

import java.util.Scanner;

public class PrimeNumber_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1:---> ");
        int number1 = input.nextInt();
        boolean prime = isPrime(number1);
        if(prime){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while(i<num){
            if(num %i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
