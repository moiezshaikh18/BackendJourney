package Challenges_part2;

import java.util.Arrays;

public class ReverseArray_45 {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse the array::");
        int[] myArray = ArrayUtility.inputArray();
        int[] result = ReverseArray(myArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] ReverseArray(int[] array){
//        int index = array.length- 1;
//        int[] reverse = new int[array.length];
//        for(int item:array){
//            reverse[index --]=item;
//        }
//        return reverse;

        //2nd approach

        int i = 0;
        while(i<array.length/2){
            int swap = array[i];
            swap = array[(array.length -1)-i];
            array[(array.length -1)-i] = swap;
            i++;
        }
        return array;
    }
}
