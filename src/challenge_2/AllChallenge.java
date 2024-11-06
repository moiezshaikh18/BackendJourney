package challenge_2;

import java.util.Scanner;

public class AllChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number:---> ");
        double a = input.nextDouble();
        System.out.print("Enter Second Number:---> ");
        double b =input.nextDouble();

        System.out.println("Challenge 9");
        System.out.println(a + b);

        System.out.println("Challenge 10 Perimeter Of Rectangle");
        System.out.println("Enter A:--> ");
        int A = input.nextInt();
        System.out.println("Enter B:--> ");
        int B = input.nextInt();
        System.out.println("Enter C:--> ");
        int C = input.nextInt();
        System.out.println("Enter D:--> ");
        int D = input.nextInt();

        System.out.println((A+B+C+D));

        System.out.println("Challenge 11 Calculate Area of Triangle");
        System.out.println("Enter BB:--> ");
        double BB = input.nextInt();
        System.out.println("Enter HH:--> ");
        double HH = input.nextInt();

        System.out.print((0.5 * BB * HH));

        System.out.println("Challenge 12 Calculate Simple Interest ");
        System.out.println("Enter P:--> ");
        int P = input.nextInt();
        System.out.println("Enter T:--> ");
        int T = input.nextInt();
        System.out.println("Enter R:--> ");
        float R = input.nextFloat();

        System.out.println("Simple Interest "+ (P*T*R)/100);

        System.out.println("Challenge 13 Compound Interest");
        System.out.println("Enter P1:--> ");
        int P1 = input.nextInt();
        System.out.println("Enter T1:--> ");
        float T1 = input.nextFloat();
        System.out.println("Enter R1:--> ");
        double R1 = input.nextDouble();
        System.out.println("Compound Interest "+(P1*Math.pow((1+R1/100),T1)));

        System.out.println("challenge 14 fahranite to celcius");
        System.out.println("Enter Temperature in fahranite:--> ");
        float temp = input.nextFloat();

        float cel = (temp - 32) * 5/9;

        System.out.println("temp in celcius "+ cel);
    }
}
