package challenge106_109.challenge106;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class TestingLambda {
    public static void main(String[] args) {

       BiFunction<Integer,Integer,Integer> multiply = (a, b) -> a * b;

        int result = multiply.apply(10,5);

        System.out.println(STR."Multiplication : \{result}");

        System.out.println("---------------------------------------");

        BiConsumer<Integer,Integer> multiplyNew = (a,b)-> System.out.println(a*b);
        multiplyNew.accept(4,6);
    }
}
