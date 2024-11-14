package Challenges_part2;

import java.util.Scanner;

public class NumberOfOccurrence_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrence");
        int[] myArray = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find:--> ");
        int num = input.nextInt();
        int occurrence = NumberOfOccurrence(myArray,num);
        System.out.println("Occurrence for "+num+" number is "+occurrence);
    }

    public static int NumberOfOccurrence(int[] array,int number){
        int count=0;
        for(int obj:array){
            if(obj == number){
                count++;
            }
        }
        return count;
    }
}
