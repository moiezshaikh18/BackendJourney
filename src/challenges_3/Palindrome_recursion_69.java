package challenges_3;

import java.util.Scanner;

public class Palindrome_recursion_69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String:---> ");
        String str = input.next();
        System.out.println("Your string is "+(isPalindrome(str) ? "Palindrome":"Not palindrome"));
    }

    public static boolean isPalindrome(String str){
        if(str.length() <= 1) return true;

        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }
        String newStr = str.substring(1,str.length()-1);
        return isPalindrome(newStr);
    }
}
