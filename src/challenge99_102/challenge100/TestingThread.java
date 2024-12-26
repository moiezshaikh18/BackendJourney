package challenge99_102.challenge100;

public class TestingThread {

    public static void main(String[] args) throws InterruptedException {

        PrintMessage printMessage = new PrintMessage();
        PrintMessage printMessage1 = new PrintMessage();

        System.out.printf("Create the thread %s\n", printMessage.getState());
        printMessage.start();

        printMessage.join();

        System.out.printf("Finish the thread %s\n", printMessage.getState());

        printMessage1.start();
    }
}
