package SpringJourney.collectionALL.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparableExample {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 15, 5, 25, 45, 6, 50, 55, 60));

        Collections.sort(nums);

        System.out.println(nums);

        Comparator<Integer> comparator = (o1, o2) -> {
            if (o1 % 10 > o2 % 10) {
                return 1;
            } else {
                return -1;
            }

        };

        nums.sort(comparator);

        System.out.println("After comparator :: " + nums);

        List<String> stringList = new ArrayList<>(List.of("rahul", "ina", "Gaurish", "moiz", "a"));

        stringList.sort((i, j) -> {
            if (i.length() > j.length()) {
                return 1;
            }
            return -1;
        });

        System.out.println(stringList);

    }
}
