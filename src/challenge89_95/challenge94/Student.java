package challenge89_95.challenge94;

public class Student {
    private final String name;
    private final char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return STR."Student{name='\{name}', grade='\{grade}'}";
    }
}
