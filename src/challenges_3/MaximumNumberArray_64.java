package challenges_3;

import Challenges_part2.ArrayUtility;

import java.util.Scanner;

public class MaximumNumberArray_64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Maximum Number of Array");
        System.out.println("Please enter number for table::");
        int[] myArray = ArrayUtility.inputArray();

        int maxValue = maximumNumber(myArray);

        System.out.println("maximum number is :: "+ maxValue);
    }

    public static int maximumNumber(int[] array){

        int max = array[0];
        for(int _item:array){
            if(_item > max){
                max = _item;
            }
        }
        return max;
    }
}
