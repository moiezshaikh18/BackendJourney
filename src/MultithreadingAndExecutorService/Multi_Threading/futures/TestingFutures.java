package MultithreadingAndExecutorService.Multi_Threading.futures;

import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        FetchName fetchName = new FetchName("Moiz");
        FetchName fetchName2 = new FetchName("subcribe");
        FetchName fetchName3 = new FetchName("girish");
        FetchName fetchName4 = new FetchName("gaurish");

        Future<String> name1 = executorService.submit(fetchName);
        Future<String> name2 = executorService.submit(fetchName2);
        Future<String> name3 = executorService.submit(fetchName3);
        Future<String> name4 = executorService.submit(fetchName4);

        System.out.printf("\nFull name is %s",name1.get());
        System.out.printf("\nFull name is %s",name2.get());
        System.out.printf("\nFull name is %s",name3.get());
        System.out.printf("\nFull name is %s",name4.get());

        executorService.shutdown();
    }
}
