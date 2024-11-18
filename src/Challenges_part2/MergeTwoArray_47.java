package Challenges_part2;

import java.util.Arrays;

public class MergeTwoArray_47 {
    public static void main(String[] args) {
        System.out.println("Welcome to merging two Array::");
        int[] myArray1 = ArrayUtility.inputArray();
        int[] myArray2 = ArrayUtility.inputArray();
        int[] sortedArray =MergeSortedArray(myArray1,myArray2);
        System.out.println("Sorted Array is::->"+ Arrays.toString(sortedArray));
    }

    public static boolean isArraySorted(int[] array){
        boolean isIncreasing = CheckSortedArray_43.isIncreasing(array);
        boolean isDecreasing = CheckSortedArray_43.isDecreasing(array);
        return isIncreasing || isDecreasing;
    }

    public static int[] MergeSortedArray(int[] array1,int[] array2){
        boolean isSortedArr1 = isArraySorted(array1);
        boolean isSortedArr2 = isArraySorted(array2);

        if (!isSortedArr1 || !isSortedArr2) {
            System.out.println("One or both arrays are not sorted.");
        }

        int[] MergedArray = new int[array1.length + array2.length];

        int i =0,j =0,k=0;

        while(i<array1.length && j<array2.length){
            if(array1[i]<= array2[j]){
                MergedArray[k++]= array1[i++];
            }else {
                MergedArray[k++] = array2[j++];
            }
        }

        while (i<array1.length){
            MergedArray[k++] = array1[i++];
        }

        while (j<array2.length){
            MergedArray[k++] = array2[j++];
        }

        return MergedArray;
    }
}
