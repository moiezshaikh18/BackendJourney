package challenges_3;

import java.util.Scanner;

public class MonthOfTheYear_57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Month of the year::");
        System.out.println("Enter the month number::");
        int monthNumber  =input.nextInt();

        String month = switch (monthNumber){
            case 1->"January";
            case 2->"February";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"August";
            case 9->"September";
            case 10->"October";
            case 11->"November";
            case 12->"December";
            default -> "Wrong Month Number";
        };

        System.out.println("Month is :: "+month);
    }
}
