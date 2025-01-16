package SpringJourney.Exceptions;

import java.util.Scanner;

public class ExceptionExample1 {
    public static void main(String[] args) throws MeraException {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number : ");
        int num = input.nextInt();

        System.out.println("Please enter the divider number : ");
        int divider = input.nextInt();

        int result = 0;
        try {
            result = num / divider;
        } catch (Exception e) {
            throw  new MeraException("Something went wrong !! you cannot divide by zero");
        }finally {
            System.out.println("This is finally block");
        }

        System.out.println("Result: " + result);
    }
}
