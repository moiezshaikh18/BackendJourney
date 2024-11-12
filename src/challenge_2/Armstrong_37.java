package challenge_2;

import java.util.Scanner;

public class Armstrong_37 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Number:---> ");
            int number = input.nextInt();
            boolean result  =isArmstrong(number);
            System.out.println("Armstrong "+ result);
    }

    public static boolean isArmstrong(int num){
        int originalNum = num;
        int sum = 0;
        while(num>0){
        int digit = num %10;
            System.out.println("digit "+digit);
         sum = (int) (sum + Math.pow(digit,3));
            System.out.println("Sum "+sum);
         num = num/10;
        }

       if (sum == originalNum){
           return true;
       }else {
           return false;
       }
    }
}
