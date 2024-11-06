package challenge_2;

import java.util.Scanner;

public class Unary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number:---> ");
        int a = input.nextInt();

        int b = -a;

        System.out.println(b);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a++);
        System.out.println(a--);
    }
}
