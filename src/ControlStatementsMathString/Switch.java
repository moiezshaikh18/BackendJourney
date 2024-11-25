package ControlStatementsMathString;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Switch Statement");
        System.out.println("Please enter your day in number::");
        int number = input.nextInt();
        oldSwitch(number);
        System.out.println("-----------------------------------------------");
        newSwitch(number);
    }

        public static void newSwitch(int day){
        String output = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Wrong data";
        };
            System.out.println("Day new switch::: "+ output);
        }

        public static void oldSwitch(int day){
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Holiday");
                    break;
                default:
                    System.out.println("You have given wrong data");
            }
        }
}

