package challenges_3;

import Challenges_part2.ArrayUtility;

import java.util.Scanner;

public class NumberOfOccurrenceUsingForEach_64 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to Number of Occurrences using for-each");
        int[] myArray = ArrayUtility.inputArray();
        System.out.println("Enter the number for find occurrence:: ");
        int num = input.nextInt();
        int result = numberOfOccurrence(myArray,num);

        System.out.println("Occurrence for given number is :: "+ result);
    }

    public static int numberOfOccurrence(int[] array,int num){
        int count = 0;
        for(int _item:array){
            if(_item == num){
                count++;
            }
        }
        return count;
    }
}
