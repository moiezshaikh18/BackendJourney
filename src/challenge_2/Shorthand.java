package challenge_2;

import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {

        int a= 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number :---> ");
        int x1 = input.nextInt();
        x1 += a;
        System.out.println(x1);
        int x2 = input.nextInt();
        x2 -= a;
        System.out.println(x2);
        int x3 = input.nextInt();
        x1 *= a;
        System.out.println(x3);
        int x4 = input.nextInt();
        x4 += a;
        System.out.println(x4);
    }
}
