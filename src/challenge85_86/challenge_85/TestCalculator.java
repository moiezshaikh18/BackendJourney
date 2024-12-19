package challenge85_86.challenge_85;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(10,5);
        System.out.println("Sum of two numbers :: "+ sum1);

        int sum2 = calculator.add(10,5,5);
        System.out.println("Sum of two numbers :: "+ sum2);

        double sum3 = calculator.add(10,10);
        System.out.println("Sum of two numbers :: "+ sum3);
    }
}
