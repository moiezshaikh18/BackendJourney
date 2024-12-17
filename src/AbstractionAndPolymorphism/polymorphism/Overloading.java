package AbstractionAndPolymorphism.polymorphism;

public class Overloading {

    private String name;

     Overloading() {
    }

     Overloading(String name) {
        this.name = name;
    }

    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {

         Overloading overloading1 = new Overloading();
        Overloading overloading = new Overloading("Ramesh");
        overloading.sum(10,5);
        overloading.sum(10,5,5);
    }
}
