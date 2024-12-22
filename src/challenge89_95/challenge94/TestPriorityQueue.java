package challenge89_95.challenge94;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        Queue<Student> students = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getGrade() - o1.getGrade();
            }
        });

        students.add(new Student("Moiz", 'B'));
        students.add(new Student("Gaurish", 'A'));
        students.add(new Student("Girish", 'A'));
        students.add(new Student("Mudassar", 'C'));

        System.out.println(students);
    }

}
