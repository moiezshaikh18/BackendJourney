package challenges_3;

import java.util.Objects;
import java.util.Scanner;

public class Break_Exit_65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("enter your command:::");
        String command = input.next();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }

        System.out.println("You have successfully exit.");
    }
}
