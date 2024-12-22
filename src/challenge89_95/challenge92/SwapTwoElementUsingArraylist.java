package challenge89_95.challenge92;

import java.util.Arrays;
import java.util.List;

public class SwapTwoElementUsingArraylist {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        swapNumber(list,2,7);
        System.out.println(list);
    }

    public static void swapNumber(List collection,int x,int y){
        int swap = (int) collection.get(x);
        collection.set(x,collection.get(y));
        collection.set(y,swap);
    }
}
