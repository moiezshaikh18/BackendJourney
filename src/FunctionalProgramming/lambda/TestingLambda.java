package FunctionalProgramming.lambda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda testingLambda = new TestingLambda();
        int sum = testingLambda.sum(10, 5);
        System.out.println(sum);
        testingLambda.printString("This is the LAMBDA practice");

        // toPrint -> System.out.println(toPrint);

        //(a,b)->a+b;

        //(a,b)->{
        // int sum = a +b;
        // System.out.println(sum);
        // }
    }

    public void printString(String toPrint) {
        System.out.println(toPrint);
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
