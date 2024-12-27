package challenge99_102.challenge101;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {

        PrintThread printThread = new PrintThread(1);
        PrintThread printThread1 = new PrintThread(2);
        PrintThread printThread2 = new PrintThread(3);

        printThread.start();

        printThread.join();

        printThread1.start();

        printThread1.join();

        printThread2.start();
    }
}
