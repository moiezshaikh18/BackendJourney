package challenge78_79;

public class Employee_79 {

    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

     String displayEmployeeDetails(){
        return STR."Employee_79{name='\{name}', age=\{age}, salary=\{salary}}";
    }

}
