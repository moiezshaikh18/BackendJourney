package Challenges_part2;

import java.util.Scanner;

public class SearchElement2DArray_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to search element in 2D array::");
        int[][] myArray = ArrayUtility.input2DArray();
        System.out.println("Now enter the number want to search::");
        int num = input.nextInt();
        boolean isElementAvailable  = isElementSearch(myArray,num);
        if(isElementAvailable){
            System.out.println("Element found!!!");
        }else {
            System.out.println("Not found :-(");
        }
    }

    public static boolean isElementSearch(int[][] array,int num){
        int i=0;
        while(i< array.length){
            int j = 0;
            while(j< array[i].length){
                if(array[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
