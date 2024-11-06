package challenge_2;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number:---> ");
        int a = input.nextInt();
        System.out.print("Enter Second Number:---> ");
        int b = input.nextInt();

        int swap = b;
        b = a;
        a= swap;

        System.out.println(a);
        System.out.println(b);
        System.out.println("Swapping Done!!!!");
    }
}
