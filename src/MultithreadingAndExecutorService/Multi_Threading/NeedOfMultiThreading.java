package MultithreadingAndExecutorService.Multi_Threading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for(int i = 1;i<=1000;i++){
            System.out.printf("%d*\n",i);
        }

        System.out.println("* task has been completed");

        for(int i = 1;i<=1000;i++){
            System.out.printf("%d$\n",i);
        }

        System.out.println("$ task has been completed");

        for(int i = 1;i<=1000;i++){
            System.out.printf("%d#\n",i);
        }

        System.out.println("# task has been completed");

        long endTime = System.currentTimeMillis();


        System.out.printf("Total num time %d",(endTime - startTime));
    }
}
