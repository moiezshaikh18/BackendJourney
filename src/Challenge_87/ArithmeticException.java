package Challenge_87;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Arithmetic Exception Challenge");

        System.out.println("Enter the two numbers::");
        int first  = input.nextInt();
        int second = input.nextInt();

        try{
            int result = first/second;
            System.out.printf("Arithmetic Exception %d",result);

        }catch (java.lang.ArithmeticException e){
            System.out.println("Please enter the valid value");
        }catch (Exception e){
            System.out.println("Different Exception");
        }
        finally {
            System.out.println("Note: don't enter 0 for division");
        }
    }
}
