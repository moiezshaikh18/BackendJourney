package FiveLectureLoopsArray;

public class ArgumentsAndParams {
    public static void main(String[] args) {
        greetingMessage("Welcome To Coding With Moiz");
        int sum = sumOfTwoNumbers(10,15);
        System.out.println("Sum of Numbers:--> "+ sum);
    }

    public static void greetingMessage(String message){
        System.out.println(message+"\n");
    }

    public static int sumOfTwoNumbers(int num1,int num2){
        return num1 + num2;
    }

}
