package challenge99_102.challenge99;

public class PrintMessage extends Thread {

    private final int threadNumber;

    public PrintMessage(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run(){
        for(int i = 0;i<10;i++){
            System.out.printf("%d.  Hello from  %s\n",(i+1),threadNumber);
        }
    }
}
