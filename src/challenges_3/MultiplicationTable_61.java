package challenges_3;

import java.util.Scanner;

public class MultiplicationTable_61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Switch Statement");
        System.out.println("Please enter number for table::");
        int number = input.nextInt();

        for(int i= 1;i<=10;i++){
            System.out.println(number +" X "+ i + " = "+(number * i));
        }
    }

}
