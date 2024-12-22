package CollectionsAndGenerics.Collection.QueueInterface;

import CollectionsAndGenerics.Utility;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {

        System.out.println("Collection is :: ");
        Queue<Number> queue = new LinkedList<>();

        queue.add(10);
        queue.add(11);
        queue.add(12);

        Utility.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
