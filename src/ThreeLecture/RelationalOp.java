package ThreeLecture;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class RelationalOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving Portal");
        System.out.print("Please Enter Your Age:--> ");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("Wow!!! Eligible");
        }else {
            System.out.println("Please Bhai Cycle Chalao");
        }
    }
}
