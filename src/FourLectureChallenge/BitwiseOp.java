package FourLectureChallenge;

import java.util.Scanner;

public class BitwiseOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND operator");
        System.out.println("Please Enter First Number:---> ");
        int first = input.nextInt();
        System.out.println("Please Enter Second Number-----> ");
        int second = input.nextInt();

        int resultAnd  = first & second;

        System.out.println(resultAnd+" Bitwise AND result.");

        int resultOr = first | second;

        System.out.println(resultOr+" Bitwise OR result.");

        int resultXor = first ^ second;

        System.out.println(resultXor+" Bitwise XOR result.");

        int resultLeft = first << second;

        System.out.println(resultLeft+" Bitwise LEFT SHIFT result.");

        int resultRight = first >> second;

        System.out.println(resultRight+" Bitwise RIGHT SHIFT result.");

        int resultCompliment = first >> second;

        System.out.println(resultCompliment+" Bitwise COMPLIMENT result.");
    }
}
