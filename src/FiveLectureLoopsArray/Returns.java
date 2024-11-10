package FiveLectureLoopsArray;

import java.util.Scanner;

public class Returns {
    public static void main(String[] args) {

        greetingMessage("Welcome To Calculator");
        int sum = readNumber() + readNumber();
        System.out.println("Sum of two Number:-> "+ sum);
    }

    public static void greetingMessage(String message){
        System.out.println(message+"\n");
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Number:---> ");
        int first = input.nextInt();
        return first;
    }
}
