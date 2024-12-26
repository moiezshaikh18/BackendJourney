package MultithreadingAndExecutorService.Multi_Threading.ThreadClass;

public class ExtendingThreadClass{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FirstTask firstTask = new FirstTask();
        SecondTask secondTask = new SecondTask();
        ThirdTask thirdTask = new ThirdTask();

        System.out.println("\nStarting first thread");
        firstTask.start();

        System.out.println("\nStarting second thread");
        secondTask.start();

        System.out.println("\nStarting third thread");
        thirdTask.start();

        long endTime = System.currentTimeMillis();

        System.out.printf("%sTotal num time %d",Thread.currentThread().getName(),(endTime - startTime));


    }
}
