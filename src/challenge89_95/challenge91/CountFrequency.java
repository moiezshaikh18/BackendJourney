package challenge89_95.challenge91;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountFrequency {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Moiz","Moiz","gaursih","Moiz","Moin");
        countFreqArrayList(list);
    }

    public static void countFreqArrayList(Collection collection){
        System.out.println(Collections.frequency(collection,"Moiz"));
    }
}
