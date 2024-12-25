package MultithreadingAndExecutorService.Multi_Threading.Syncronized;

public class TestingSynchronize {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();

        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(STR."Thread interrupted::\{e.getMessage()}");
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();

        System.out.printf("Final counter value : %d time taken:: %d", counter.getCount(), (endTime - startTime));

    }
}
