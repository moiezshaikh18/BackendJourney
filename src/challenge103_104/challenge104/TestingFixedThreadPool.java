package challenge103_104.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingFixedThreadPool {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        PrintNumber task1 = new PrintNumber();
        PrintNumber task2 = new PrintNumber();
        PrintNumber task3 = new PrintNumber();
        PrintNumber task4 = new PrintNumber();

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);

        if(!executorService.awaitTermination(10, TimeUnit.SECONDS)){
            executorService.shutdownNow();
        }
    }
}
