package ControlStatementsMathString;

public class MathExample {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.07));


        for(int i = 1;i<=10;i++){
            System.out.println(Math.round(Math.random() *100));
        }
    }
}
