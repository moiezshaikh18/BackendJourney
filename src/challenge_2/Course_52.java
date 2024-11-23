package challenge_2;

public class Course_52 {

    static int maxCapacity =100;
    String courseName;
    int enrollments;

    int[] enrolledStudent = new int[maxCapacity];


    public Course_52(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudent = new int[maxCapacity];
    }

    String enrollStudent(String studentName){
        enrolledStudent[enrollments] = Integer.parseInt(studentName);
        enrollments++;
        return studentName;
    }

    String unEnrollStudent(){
        enrolledStudent[enrollments] = Integer.parseInt("moiz");
        enrollments --;
        return "moiz";
    }

    static int  setMaxCapacity(int capacity){
        Course_52.maxCapacity = capacity;
        return  capacity;
    }


    public static void main(String[] args) {
        Course_52 c1 = new Course_52("Java");
        String result1 = c1.enrollStudent("Moiz");
        System.out.println(result1);

         result1 = c1.enrollStudent("Gaurish");
        System.out.println(result1);

        String result2 = c1.unEnrollStudent();
        System.out.println(result2);

    }
}
