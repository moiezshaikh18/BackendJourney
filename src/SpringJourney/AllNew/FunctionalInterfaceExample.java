package SpringJourney.AllNew;

@FunctionalInterface
interface A {
    void show(int i);
}


// one way of implements
//class B implements A{
//    @Override
//    public void show() {
//        System.out.println("This is A interface");
//    }
//}


public class FunctionalInterfaceExample {
    public static void main(String[] args) {
//        B b = new B();
//        b.show();

        // Second way of typing
//        A a = new A() {
//            @Override
//            public void show() {
//                System.out.println("this is anonymous class");
//            }
//        };
//
//        a.show();

        A a = i -> System.out.println("this is public interface " + 5);

        a.show(5);

        System.out.println("Functional interface");
    }
}
