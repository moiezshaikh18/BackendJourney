package challenges_3;

import java.util.Scanner;

public class PasswordChecker_59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass ;

        do{
            System.out.println("Please enter valid password: ");
             pass = input.next();

        }while(!isValidPassword(pass));

        System.out.println("Password Match!!!");
    }

    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
