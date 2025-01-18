package SpringJourney.Thread;

class Counter{
    int count;

    public synchronized void increment(){
        count ++;
    }
}


public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {


        Counter counter = new Counter();

        Runnable obj = () -> {
            for (int i = 1; i < 1000; i++) {
                counter.increment();
            }
        };

        Runnable obj1 = () -> {
            for (int i = 1; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
