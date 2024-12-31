package FunctionalProgramming.Streams;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {

        List<String> fruits = List.of("Apple", "Banana", "Mango", "Cherry", "Date");
        System.out.printf("%d", fruits.size());

        System.out.println("\nPrinting Fruit Normally");
        for (String _fruit : fruits) {
            System.out.println(_fruit);
        }

        System.out.println("Printing Fruits Using Stream:---->");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.printf("%s", s);
            }
        });

        System.out.println("\nLAMBDA:::-->");

        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }
}
