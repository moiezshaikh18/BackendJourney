package challenge89_95.challenge95;

import java.util.*;

public class UniqueCharacter {
    public static void main(String[] args) {

        Set<Character> set = new HashSet<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String please:: ");

        String userStr = input.next();

        for(char ch:userStr.toCharArray()){
            set.add(ch);
        }

        System.out.println(STR."unique char in string is :: \{set.size()}");
    }
}
