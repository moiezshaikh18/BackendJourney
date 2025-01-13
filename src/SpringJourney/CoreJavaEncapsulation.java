package SpringJourney;


class Human {
    private int age;
    private String name;

    public Human() {

    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class CoreJavaEncapsulation {
    public static void main(String[] args) {

        Human human = new Human();
        human.setAge(11);
        human.setName("Moiz");

        Human human1 = new Human(15, "Rahul");
        new Human(20,"Ramesh");

        System.out.println(STR."\{human.getAge()} \{human.getName()}");
        System.out.println(STR."Human 2 \{human1.getAge()} \{human1.getName()}");
    }
}
