package challenge78_79;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee_79 employee79 = new Employee_79();
        employee79.setName("Moiz");
        employee79.setAge(32);
        employee79.setSalary(144000.00);
        System.out.println(STR."Details using getter:: \{employee79.getName()} \{employee79.getAge()} \{employee79.getSalary()}");

        System.out.println(employee79.displayEmployeeDetails());
    }
}
