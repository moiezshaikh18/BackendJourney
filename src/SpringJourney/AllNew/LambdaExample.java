package SpringJourney.AllNew;

@FunctionalInterface
interface Test {
    int add(int i, int j);
}


public class LambdaExample {
    public static void main(String[] args) {

        Test test = (i, j) -> {
            return i + j;
        };

       int data =  test.add(10,15);

        System.out.println(data);
    }
}
