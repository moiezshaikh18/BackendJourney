package challenge103_104.challenge105;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialExecutorServiceWithoutCollection {

    // Method to calculate factorial of a number
    public static long calculateFactorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Array of numbers for which factorial is to be calculated
        int[] numbers = {5, 7, 10, 3, 6};

        // ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        try {
            // Submit tasks and retrieve results one by one
            System.out.println("Factorial Results:");
            for (int number : numbers) {
                Callable<Long> task = () -> calculateFactorial(number);
                Future<Long> future = executorService.submit(task);

                // Retrieve and print the result
                System.out.println("Factorial of " + number + " = " + future.get());
            }
        } catch (Exception e) {
            System.err.println("Error occurred while executing tasks: " + e.getMessage());
        } finally {
            // Shutdown the ExecutorService
            executorService.shutdown();
        }
    }
}
