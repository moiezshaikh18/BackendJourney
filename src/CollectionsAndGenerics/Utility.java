package CollectionsAndGenerics;

import java.util.Collection;

public class Utility {

    public static void print(Collection collection){
        for (Object _item:collection){
            System.out.printf("Collection item:: %s \n",_item.toString());
        }
        System.out.println();
    }
}
