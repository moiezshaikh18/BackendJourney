package MultithreadingAndExecutorService.Multi_Threading.Executor;

import MultithreadingAndExecutorService.Multi_Threading.runnable.PrintTask;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        PrintTask task = new PrintTask('A');
        PrintTask task2 = new PrintTask('B');
        PrintTask task3 = new PrintTask('C');

        executorService.submit(task);
        executorService.submit(task2);
        executorService.submit(task3);


        executorService.shutdown();
    }
}
