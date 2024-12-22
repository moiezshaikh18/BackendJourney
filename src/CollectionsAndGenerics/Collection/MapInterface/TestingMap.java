package CollectionsAndGenerics.Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<Integer ,String> map = new HashMap<>();

        map.put(1,"Moiz");
        map.put(2,"Girish");
        map.put(3,"Gaurish");
        map.put(4,"Muddu");
        map.put(5,"Moin");
        map.put(6,"Moiz");

        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
