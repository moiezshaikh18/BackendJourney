package challenges_3;

import Challenges_part2.ArrayUtility;

public class Continue_SumOfNum_66 {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of all positive number::");
        int[] myArray = ArrayUtility.inputArray();
        int sum = 0;

        for (int j : myArray) {
            if (j < 0) {
                continue;
            }
            sum = sum + j;
        }

        System.out.println("Sum of all positive number is:: "+sum);
    }
}
