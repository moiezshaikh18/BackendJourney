package ExceptionAndFileHandling.TypeOfException;

import java.util.Scanner;

public class ExceptionFlow {
    public static void main(String[] args) {
        a();
    }

    private static void a(){
        b();
    }

    private static void b(){
        c();
    }

    private static void c(){
        d();
    }

    private static void d(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to division calculator ");
        System.out.println("Please enter your two numbers::");

        int first = input.nextInt();
        int second = input.nextInt();

        try{
            int [] a = new int[5];
            System.out.printf("Result is %d",a[6]);
            a[6] = first / second;
            System.out.printf("Result is %d",a[6]);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero please enter valid value.");
        }catch (Throwable th){
            System.out.println("General Exception");
            throw  th;
        }finally {
            System.out.println("Finally block...");
        }
    }
}
