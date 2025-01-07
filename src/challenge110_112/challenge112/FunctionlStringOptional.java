package challenge110_112.challenge112;

import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public class FunctionlStringOptional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string ::");
        String name = input.next();

        System.out.println(toOptional(null));
        System.out.println(toOptional(""));
        System.out.println(toOptional("pop"));
    }

    public static Optional<String> toOptional(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(str.toUpperCase());
    }
}
