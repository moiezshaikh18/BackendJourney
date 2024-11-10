package challenge_2;

import java.util.Scanner;

public class MultiplicationTable_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:---> ");
        int number = input.nextInt();
        printMultiplicationTable(number);
    }

    public static void printMultiplicationTable(int num){
        int i = 1;
        while (i<=10){
            System.out.println(num + " X " + i +" = "+(i * num));
            i++;
        }
    }
}
