package Challenges_part2;

public class MaximumAndMinimum_42 {
    public static void main(String[] args) {
        System.out.println("Welcome to max and min array");
        int[] myArray = ArrayUtility.inputArray();
        int max=Maximum(myArray);
        int min = Minimum(myArray);
        System.out.println("Max of the array::"+max);
        System.out.println("Min of the array::"+min);
    }

    public static int Maximum(int[] array) {
        if(array.length == 0){
            return Integer.MAX_VALUE;
        }
        int max = array[0];
        int i = 1;
        while(i<array.length){
            if(max<array[i]){
                max = array[i];
            }
            i++;
        }
        return max;
    }

    public static int Minimum(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE; // handle empty array
        }
        int min = array[0]; // Initialize min as first element
        int i = 1;
        while (i < array.length) {
            if (min > array[i]) {
                min = array[i];
            }
            i++;
        }
        return min;
    }

}
