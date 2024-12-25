package MultithreadingAndExecutorService.Multi_Threading.runnable;

public class PrintTask implements Runnable {
    @Override
    public void run() {

        //Print Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d %c", i, targetChar);
        }

        System.out.printf("%s%c\n task has been completed", Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
