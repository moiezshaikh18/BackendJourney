package challenge103_104.challenge104;

public class PrintNumber implements Runnable {

    @Override
    public void run() {
        System.out.printf("\n%s",Thread.currentThread().getName());
        int numberSleep = (int) (Math.random() *5);
        try {
            Thread.sleep(numberSleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
