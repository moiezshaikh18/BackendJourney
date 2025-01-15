package SpringJourney;

interface AB {

    int age = 44; // final and static
    String area = "Pune";


    void show();
}

interface BA{
    void showBADisplay();
}

class B implements AB,BA {

    @Override
    public void show() {
        System.out.println("This interface implemented by the child class");
    }

    @Override
    public void showBADisplay() {
        System.out.println("This is the second interface method");
    }
}


public class AdvanceJavaInterface {
    public static void main(String[] args) {

        B b = new B();
        b.show();
        b.showBADisplay();
    }
}
