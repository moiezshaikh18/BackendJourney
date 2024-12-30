package challenge103_104.challenge103;

public class PrintNumber implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\n", i);
        }
    }
}
