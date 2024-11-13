package ArraysLastPartOne;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Number:---> ");
        int number = input.nextInt();
        int[] myArray={12,152,14,15,13,2,1,34,56,10};

        boolean result = isArrayValueAvailable(number,myArray);
        if(result){
            System.out.println("Matched");
        }else{
            System.out.println("Unmatched");
        }
    }

    public static boolean isArrayValueAvailable(int num ,int[] array){
       for(int j:array){
           if(j == num){
               return true;
           }
       }
       return false;
    }
}
