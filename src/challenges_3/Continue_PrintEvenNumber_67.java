package challenges_3;

import Challenges_part2.ArrayUtility;

public class Continue_PrintEvenNumber_67 {
    public static void main(String[] args) {
        System.out.println("Welcome to print even number number::");
        int[] myArray = ArrayUtility.inputArray();

        for (int j : myArray) {

            if(j%2 != 0)
            {
              continue;
            }
            System.out.println("Even Number:: "+ j);
    }
    }
}
