package FiveLectureLoopsArray;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 1; // initialization
        while (num<=10){ // condition
            System.out.println(num);  // actual work
            num ++; // updating the condition
        }

        System.out.println("reverse counting");

        int num2 =250; // initialization
        while (num2 >= 200){ // condition
            System.out.println(num2); // actual work
            num2--; // updating condition
        }


        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i<5){
            System.out.println("Please Enter Number:--> ");
            int userInput = input.nextInt();
            System.out.println("Number is :-> "+ userInput);
            i++;
        }
    }
}
