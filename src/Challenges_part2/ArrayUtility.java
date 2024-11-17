package Challenges_part2;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the size of array:--> ");
        int size = input.nextInt();
        int[] myArray = new int[size];
        int i= 0;
        while(i<size){
            System.out.print("Please Enter the element no "+(i+1)+" : ");
            myArray[i] = input.nextInt();
            i++;
        }
        return myArray;
    }

    public static void displayArray(int[] numArray){
        int i = 0;
        while(i<numArray.length){
            System.out.print("The new array is:: "+ numArray[i] + " ");
            i++;
        }
    }
}
