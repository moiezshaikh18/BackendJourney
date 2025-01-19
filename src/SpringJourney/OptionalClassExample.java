package SpringJourney;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


class Student2{
    private String name;

    public Student2() {
    }

    public Student2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class OptionalClassExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Navin", "gaurish", "girish", "Moiz");


        List<Student2> students = new ArrayList<>();


        for (String s:list){
            students.add(new Student2(s));
        }


        System.out.println(students);

        // Find the first string containing 'g'
        Optional<String> newlist = list.stream()
                .filter(_item -> _item.toLowerCase().contains("g"))
                .findFirst();

        // Print the result using Optional's methods
        if (newlist.isPresent()) {
            System.out.println("First match: " + newlist.get());
        } else {
            System.out.println("No match found!");
        }
    }
}
