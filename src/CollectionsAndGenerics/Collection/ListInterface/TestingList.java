package CollectionsAndGenerics.Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestingList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("ramesh");
        list.add("Rahul");

        if(list.contains("Rahul")){
            System.out.println("Rahul exist ");
        }

        for (Object _item:list){
            System.out.println(_item);
        }

    }
}
