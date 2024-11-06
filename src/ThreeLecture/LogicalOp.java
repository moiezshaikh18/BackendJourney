package ThreeLecture;

import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator");
        System.out.println("Please enter your age:--> ");
        int age = input.nextInt();
        System.out.println("Are you a female ? true or false");
        boolean isFemale = input.nextBoolean();
        
        if(age < 5){
            System.out.println("You have 75% discount");
        }else if(isFemale){
            System.out.println("You have 50% discount");
        }else if(age > 60 && !isFemale){
            System.out.println("You have got 25% discount");
        }else {
            System.out.println("You have no discount");
        }

    }
}
