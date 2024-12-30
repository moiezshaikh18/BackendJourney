package challenge103_104.challenge103;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingPrintNumber {
    public static void main(String[] args) {

        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            PrintNumber printNumber = new PrintNumber();

            executorService.submit(printNumber);
        }

    }
}
