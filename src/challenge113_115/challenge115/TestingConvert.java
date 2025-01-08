package challenge113_115.challenge115;

import java.util.List;

public class TestingConvert {
    public static void main(String[] args) {

        List<String> numbers = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");

        int result = numbers.stream().
                map(_num -> Integer.parseInt(_num)).
                map(_num -> _num * _num).
                reduce(0, Integer::sum);

        System.out.println(STR."Sum of array is: \{result}");
    }
}
