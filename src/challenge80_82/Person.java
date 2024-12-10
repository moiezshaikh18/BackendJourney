package challenge80_82;

import java.util.Objects;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Moiz",31);
        Person person2 = new Person("Moiz",31);

        if(person1.equals(person2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
