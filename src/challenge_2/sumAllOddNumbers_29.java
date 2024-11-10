package challenge_2;

import java.util.Scanner;

public class sumAllOddNumbers_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:---> ");
        int number = input.nextInt();
        sumOfOddNumbers(number);
    }

    public static void sumOfOddNumbers(int num){
        int i=1;
        int sum=0;
        while(i<=num){
            if(i %2 !=0){
                sum = sum +i;
            }
            i++;
        }
        System.out.println("Sum Of Odd Numbers:---> "+ sum);
    }
}
