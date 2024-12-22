package challenge89_95.challenge90;

import java.util.*;

public class CustomComprator {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("gaurish","pooja","girish","nitu");
        System.out.println("Before sorting "+list);
        sortInDescending(list);
        System.out.println(list);
    }

    public static void sortInDescending(List<String> stringList){
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String s2) {
                if(s.equals(s2)){
                    return 0;
                } else if (s.charAt(0)<s2.charAt(0)) {
                    return 1;
                }else {
                    return -1;
                }
            }
        });
    }
}
