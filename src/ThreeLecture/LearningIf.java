package ThreeLecture;

import java.util.Scanner;

public class LearningIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Age:--> ");
        int a = input.nextInt();

       if(a <=0){
           System.out.println("Not Valid");
       }else if(a >= 10){
           System.out.println("Young");
       }else{
           System.out.println("Old");
       }
    }
}
