package MultithreadingAndExecutorService.Multi_Threading.ThreadClass;

public class SecondTask extends Thread {

    @Override
    public void run() {

        for(int i = 1;i<=1000;i++){
            System.out.printf("%d$",i);
        }

        System.out.printf("\n%s$ task has been completed",Thread.currentThread().getName());
    }
}
