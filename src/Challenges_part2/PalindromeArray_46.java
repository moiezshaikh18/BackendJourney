package Challenges_part2;

public class PalindromeArray_46 {
    public static void main(String[] args) {
        System.out.println("Welcome to check array is palindrome");
        int[] myArray = ArrayUtility.inputArray();
        boolean isPalindrome = isPalindrome(myArray);
        if(isPalindrome){
            System.out.println("Palindrome !!!");
        }else {
            System.out.println("Not Palindrome :-(");
        }
    }

    public static boolean isPalindrome(int[] array){
        int[] reverseArray = ReverseArray_45.ReverseArray(array);

        // Compare contents of both arrays
        if (array.length != reverseArray.length) {
            return false; // If lengths don't match, it can't be a palindrome
        }

        int index = 0;
        for(int item:array){
            if(item  != reverseArray[index++]){
                return false;
            }
        }
        return true;
    }
}
