package CollectionsAndGenerics.Collection.CollectonsClass;

import CollectionsAndGenerics.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollectionsClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(-76);

        Collections.sort(list);

        Utility.print(list);

        List<Integer> unmodifiable = Collections.unmodifiableList(list);

        unmodifiable.add(45);
    }
}
