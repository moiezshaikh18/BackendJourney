package challenge80_82;

import Challenges_part2.ArrayUtility;

import java.util.Arrays;

public class ArrayOperations {

    private int[]  myArray = ArrayUtility.inputArray();
    private class Statistic{

        public double mean(){
            long sum = 0;
           for(int number:myArray){
               sum = sum + number;
           }

            return (double) sum /myArray.length;
        }

        public double median() {
            // Sort the array
            Arrays.sort(myArray);

            int n = myArray.length;
            // Check if the length is odd or even
            if (n % 2 != 0) {
                // For odd length, return the middle element
                return myArray[n / 2];
            } else {
                // For even length, return the average of the two middle elements
                return (myArray[n / 2 - 1] + myArray[n / 2]) / 2.0;
            }
        }
    }

    public static void main(String[] args) {
        ArrayOperations arrayOperations  = new ArrayOperations();
        ArrayOperations.Statistic statistic = arrayOperations.new Statistic();
        System.out.println(STR."Mean: \{statistic.mean()}");
        System.out.println(STR."Median: \{statistic.median()}");
    }
}
