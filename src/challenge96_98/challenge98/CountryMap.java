package challenge96_98.challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of map::");
        int size = input.nextInt();
        input.nextLine(); // Consume the leftover newline

        Map<String, String> countyMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the country::");
            String country = input.nextLine();

            System.out.println("Enter the capital::");
            String capital = input.nextLine();

            countyMap.put(country, capital);
        }

        System.out.println("Enter the country name to find out capital of it::");
        String findCapital = input.nextLine();

        // Directly fetch the capital using Map.get()
        String capital = countyMap.get(findCapital);
        if (capital != null) {
            System.out.println("The capital of " + findCapital + " is " + capital);
        } else {
            System.out.println("Don't Have Data for " + findCapital);
        }

        input.close(); // Close the scanner
    }
}
