package challenge_2;

import java.util.Scanner;

public class LeastCommonMultiple_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1:---> ");
        int number1 = input.nextInt();
        System.out.print("Enter Number 2:---> ");
        int number2 = input.nextInt();
        int lcm = LeastCommonMultiple(number1,number2);
        System.out.println("LCM for two number is :---> "+lcm);
    }

    public static int LeastCommonMultiple(int num,int num2){
        int i = 1;
        while(i<=num2){ // while(true)
            int factor = num *i;
            if(factor % num2 == 0 ){
                return factor;
            }
            i++;
        }
        return 0; // unreachable
    }
}
