package challenges_3;

import java.util.Scanner;

public class PrimesUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number");
        System.out.println("Please enter number ::");
        int number = input.nextInt();

        for(int i= 2;i<=10;i++){
            if(number % 2 != 0){
                System.out.println("Number is Prime");
                break;
            }
        }
        System.out.println("Not a Prime");
    }
}
