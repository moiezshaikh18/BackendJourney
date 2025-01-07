package challenge106_109.challenge108;

import java.util.List;
import java.util.stream.Collectors;

public class StringConcat {
    public static void main(String[] args) {

        List<String> sentence = List.of("short", "this is a long string", "tiny", "another long string", "Java");

        String data = sentence.stream().filter((_string) -> _string.length() < 10).collect(Collectors.joining(" "));

        System.out.println(data);

        System.out.println("-------------------------------------------------");

       String result = sentence.stream().filter(_string -> _string.length() > 10).reduce(" ", (a, b) -> a + " " + b);

        System.out.println("Using reduce method"+result);
    }
}
