package CollectionsAndGenerics.Collection.SetInterface;

import CollectionsAndGenerics.Utility;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {

        Set<Object> set  = new LinkedHashSet<>();

        set.add("Apple");
        set.add(56);
        set.add("Apple"); // duplicate don't in set

        Utility.print(set);

        System.out.println(set.contains("Apple"));
        System.out.println(set.remove("Apple"));
        Utility.print(set);

        System.out.println(set.remove("Apple"));
    }
}
