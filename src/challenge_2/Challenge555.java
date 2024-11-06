package challenge_2;

import java.util.Scanner;

public class Challenge555 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Challenge 15");
//        System.out.println("Please Enter Number:--> ");
//        int number = input.nextInt();
//        if(number > 0){
//            System.out.println("Number is Positive");
//        }else if(number == 0){
//            System.out.println("0");
//        }else {
//            System.out.println("Negative");
//        }
//
//        System.out.println("challenge 16");
//        System.out.println("Even or odd Number:---> ");
//        int num = input.nextInt();
//        if(num %2== 0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }
//
//        System.out.println("Challenge 18");
//

//        System.out.println("Challenge 20");
//        System.out.println("Please Enter your age to categories group:---> ");
//        int old = input.nextInt();
//
//        if(old < 13){
//            System.out.println("Child");
//        }else if(old < 20){
//            System.out.println("Teen");
//        }else if(old < 60){
//            System.out.println("Adult");
//        }else if(old > 60){
//            System.out.println("Senior");
//        }

//        System.out.println("Challenge 17 Greatest of Three Number");
//        System.out.println("Please Enter First number:-->");
//        int first =input.nextInt();
//        System.out.println("Please enter Second Number:---> ");
//        int second = input.nextInt();
//        System.out.println("Please Enter Third Number:---->");
//        int third = input.nextInt();
//
//        if(first > second && first > third){
//            System.out.println(first +" greatest number");
//        }else if(second > first && second > third){
//            System.out.println(second + " greatest number");
//        }else {
//            System.out.println(third +" greatest number");
//        }

        System.out.println("Challenge 18 Leap Year");
        System.out.println("Enter Year:---> ");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not leap year");
        }
    }
}
