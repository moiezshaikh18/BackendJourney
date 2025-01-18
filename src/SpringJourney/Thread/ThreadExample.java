package SpringJourney.Thread;

//class A extends Thread {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}


//class A implements Runnable {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}


public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
//        A a = new A();
//
//        a.start();


//
//        Thread thread = new Thread(a);
//        thread.start();
//        System.out.println(thread.getPriority());

        Runnable obj = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        obj.run();
    }
}
