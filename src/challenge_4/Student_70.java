package challenge_4;

public class Student_70 {

    String studentName;
    int age;

    public Student_70(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student_70{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student_70 student_70 = new Student_70("Mohamed", 20);
        System.out.println(student_70);
    }
}
