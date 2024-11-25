package challenges_3;

import java.util.Scanner;

public class ScoreGrade_56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Number::");
        System.out.println("Enter the marks in percentage::");
        int marks  =input.nextInt();
        String result = marks > 80?"High":marks == 80 || marks >50?"Moderate":"Low";

        System.out.println("Grade "+result);
    }
}
