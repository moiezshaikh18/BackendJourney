package challenge_2;

import java.util.Scanner;

public class Patterns_40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:---> ");
        int rows = input.nextInt();

        patternOne(rows);
        System.out.println("------------------------------------------");
        patternTwo(rows);
        System.out.println("------------------------------------------");
        patternThird(rows);
    }

    public static void patternOne(int rows){
        int i=0;
        while(i<rows){
            int j = 0;
            while(j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void patternTwo(int rows){
        int i=0;
        while(i<=rows){
            int j =rows ;
            while(j>=i){
                System.out.print(" * ");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    public static void patternThird(int rows) {
        int i = 1;
        while (i <= rows) {
            // Loop to print spaces
            int space = rows - i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            // Loop to print stars
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }

}


