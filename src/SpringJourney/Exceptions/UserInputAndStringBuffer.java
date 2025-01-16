package SpringJourney.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputAndStringBuffer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the number");
        int num = input.nextInt();

        System.out.println(num);

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            System.out.println("num 2 : ");
            int num2 = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Num 2 : " + num2);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {


            input.close();
        }

    }
}
