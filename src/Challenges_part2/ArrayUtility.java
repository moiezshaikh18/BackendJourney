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

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows:--> ");
        int row = input.nextInt();
        System.out.println("Please enter number of columns:--> ");
        int columns = input.nextInt();
        int[][] myArray = new int[row][columns];


        int i= 0;
        while(i<row){
            int j = 0;
            while(j<columns){
                System.out.print("Please Enter the element row "+(i+1)+" , "+ "columns: "+(j+1)+" : ");
                myArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return myArray;
    }
}
