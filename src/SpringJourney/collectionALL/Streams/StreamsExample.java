package SpringJourney.collectionALL.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {

        // Initialize a list of numbers
        List<Integer> nums = Arrays.asList(1, 45, 48, 3, 5, 45, 9, 10, 11);

        // Print the original list
        System.out.println("Original list: " + nums);

        // Calculate the sum of even numbers
        int evenSum = nums.stream()
                .filter(_num -> _num % 2 == 0) // Filter even numbers
                .mapToInt(Integer::intValue)   // Convert Integer to int
                .sum();                        // Sum the filtered numbers

        // Print the sum of even numbers
        System.out.println("Sum of even numbers: " + evenSum);
    }
}
