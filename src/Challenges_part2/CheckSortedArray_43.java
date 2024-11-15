package Challenges_part2;

public class CheckSortedArray_43 {
    public static void main(String[] args) {
        System.out.println("Welcome to given array is sorted::");
        int[] myArray = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(myArray);
        boolean isDec = isDecreasing(myArray);
        if(isInc || isDec){
            System.out.println("Given Array is Sorted!!");
        }else {
            System.out.println("Given Array is Unsorted!!");
        }
    }

    public static boolean isIncreasing(int[] array){
        int i = 1;
        while(i<array.length){
            if(array[i]< array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] array){
        int i = 1;
        while(i<array.length){
            if(array[i]> array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
