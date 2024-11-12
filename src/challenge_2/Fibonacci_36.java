package challenge_2;

import java.util.Scanner;

public class Fibonacci_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:---> ");
        int number = input.nextInt();
        int result  =Fibonacci(number);
        System.out.println("Fibonacci "+ result);
    }

    public static int Fibonacci(int num){
        if(num<0) return num;
        System.out.println("0 ");
        if(num == 0) return num;
        int nextNumber = 0;
        int a =0;
        int b=1;
        int i = 0;
        while(i<=num-i){  //(a + b <=num) for the i minus
            nextNumber = a +b;
            System.out.println("nextNumber:--> "+nextNumber);
            a =b;
            b=nextNumber;
            i++;
        }
        return  nextNumber;
    }
}
