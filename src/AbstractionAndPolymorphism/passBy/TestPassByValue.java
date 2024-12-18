package AbstractionAndPolymorphism.passBy;

public class TestPassByValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int sum = add(x,y);
        System.out.println("Addition passing value:: "+ sum);
    }

    public static int add(int a,int b){
        return a + b;
    }
}
