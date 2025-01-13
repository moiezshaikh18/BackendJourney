package SpringJourney;

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public void show(){
        System.out.println("Calc Method");
    }
}

class Calc2 extends Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }

    public void show(){
        System.out.println("Calc2 Method");
    }

}


public class CoreJavaInheritance {
    public static void main(String[] args) {

        Calc2 calc2 = new Calc2();

        Calc calc = new Calc2();
        calc.show();

//        int add = calc2.add(10, 15);
//        int sub = calc2.sub(10, 15);
//        int multi = calc2.multi(10, 15);
//        int divide = calc2.divide(10, 15);
//
//
//        calc2.show();
//        System.out.println("add " + add + " sub " + sub + " multi " + multi + " divide " + divide);

        // Modifier :-
    }
}
