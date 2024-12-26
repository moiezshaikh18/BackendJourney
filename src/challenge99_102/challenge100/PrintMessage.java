package challenge99_102.challenge100;

public class PrintMessage extends Thread {

    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println(STR."From inside \{Thread.currentThread().getState()}\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
