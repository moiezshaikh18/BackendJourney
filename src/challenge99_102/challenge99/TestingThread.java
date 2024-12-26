package challenge99_102.challenge99;

public class TestingThread {
    public static void main(String[] args) {

        PrintMessage printMessage = new PrintMessage(1);
        PrintMessage printMessage1  = new PrintMessage(2);

        printMessage.start();
        printMessage1.start();
    }
}
