package FunctionalProgramming.Functional_Interface_MethodRef;

import java.util.List;

public class TestingMethodInterface {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(21, 545, 645, 4564, 65451, 12, 454, 1, 5, 1);

        numbers.stream().filter(_num -> _num % 2 != 0).forEach(System.out::println);

    }
}
