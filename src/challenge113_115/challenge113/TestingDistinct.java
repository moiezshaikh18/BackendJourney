package challenge113_115.challenge113;

import ArraysLastPartOne.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,5,5,1,2,3,4,6,7,8,9,9);

        List<Integer> uniqueNumber = numbers.stream().sorted().distinct().toList();

        System.out.println(uniqueNumber);
    }
}
