package FunctionalProgramming.OptionalClass;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

public class TestingOptionalClass {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,15,5,6,45,8,9);
        Optional<Integer> newNumbers = numbers.stream().reduce((a,b)->a+b);

        if (newNumbers.isPresent()){
            System.out.println(newNumbers.get());
        }else {
            System.out.println("List is empty");
        }
    }
}
