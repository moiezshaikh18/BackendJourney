package Challenges_part2;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnNewArray_44 {
    public static void main(String[] args) {
        System.out.println("Welcome to the deleting new element and return new array:: ");
        int[] myArray = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number::");
        int num = input.nextInt();

        int[] newArray =ReturnNewArray(myArray,num);
        System.out.println("New Array Is :: "+ Arrays.toString(newArray));
    }

    public static int[] ReturnNewArray(int[] array,int number){

        int count = NumberOfOccurrence_41.NumberOfOccurrence(array,number);

        // Calculate the size of the new array
        int newSize = array.length - count;
        int[] newArray = new int[newSize];
        int index = 0;
        for(int _item:array){
            if(_item != number){
                newArray[index++] = _item;
            }
        }
        return newArray;
    }
}
