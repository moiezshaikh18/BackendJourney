package SpringJourney.collectionALL.collection;

import java.sql.Array;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2213, 54, 548, 7854, 465));

        arrayList.forEach(System.out::println);

        Set<Integer> set = new HashSet<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Please enter the value want to add in set<HashSet>: ");
            int number = input.nextInt();
            set.add(number);
        }

        Iterator<Integer> data = set.iterator();

        while (data.hasNext()) {
            System.out.println("iterator data : " + data.next());
        }

        for (Integer i : set) {
            System.out.println("All HashSet values : " + i);
        }


        Map<Integer, String> map = new HashMap<>();

        System.out.println("Please enter the hashMap data : ");
        for (int i = 1; i < 5; i++) {
            System.out.println("Enter the key " + i + " first: ");
            int key = input.nextInt();

            System.out.println("Enter the value " + i + " first: ");
            String name = input.next();

            map.put(key, name);

        }

        map.forEach((key, value) -> System.out.println(key + "  " + value));
    }
}
