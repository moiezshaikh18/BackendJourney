package TwoLecture;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name:--->");
        String name = input.nextLine();
        System.out.println("Good Morning " +name);
        System.out.print(name + " Also tell me your age:--->");
        try {
            int age = input.nextInt();
            System.out.println(name+" your age is "+age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
