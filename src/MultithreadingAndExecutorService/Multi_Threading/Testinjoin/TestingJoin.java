package MultithreadingAndExecutorService.Multi_Threading.Testinjoin;

import MultithreadingAndExecutorService.Multi_Threading.runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {

        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        System.out.println("Thread-1 Started..");
        Thread t1 = new Thread(p1);
        t1.setPriority(10);
        t1.start();

        System.out.println("Thread-1 Started..");
        Thread t2 = new Thread(p2);
        t2.setPriority(5);
        t2.start();

        t1.join();
        Thread t3 = new Thread(p3);
        t2.setPriority(1);
        t3.start();
    }
}
