package challenge106_109.challenge109;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintOddNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       List<Integer> data =  numbers.stream().filter((_num)->_num%2 != 0).collect(Collectors.toCollection(()->new ArrayList<>()));

        System.out.println(data);
    }
}
