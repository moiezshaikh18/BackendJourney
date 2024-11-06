package FourLectureChallenge;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND operator");
        System.out.println("Please Enter First Number:---> ");
        int first = input.nextInt();

        if((first & 1) == 1){
            System.out.println("ODD");
        }else {
            System.out.println("EVEN");
        }
    }
}
