package TwoLecture;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner input  =new Scanner(System.in);
        System.out.print("Please Enter Your Name:-->");
        String name =input.nextLine();
        System.out.println("Welcome "+name+" KG Coding");

        System.out.println("Program for addition of two numbers");

        System.out.print("Enter First Number:->");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number:->");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Addition of num1 and num2 is "+ sum);
    }
}
