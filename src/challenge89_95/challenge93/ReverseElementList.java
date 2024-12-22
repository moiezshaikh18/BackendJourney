package challenge89_95.challenge93;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseElementList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);

        reverseList(list);

        System.out.println(list);
    }

    public static void reverseList(List list){
        Collections.reverse(list);
    }
}
