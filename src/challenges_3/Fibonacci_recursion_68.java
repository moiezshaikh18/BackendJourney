package challenges_3;

import java.util.Scanner;

public class Fibonacci_recursion_68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:---> ");
        int count = input.nextInt();
        for(int i =1;i<=count;i++){
            System.out.print(Fibonacci(i)+" ");
        }
    }

    public static int Fibonacci(int position){
        if(position == 1) return 0;
        if(position == 2) return 1;

        return Fibonacci(position - 1) + Fibonacci(position -2);
    }
}
