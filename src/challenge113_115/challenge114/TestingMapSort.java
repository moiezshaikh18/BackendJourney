package challenge113_115.challenge114;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestingMapSort {
    public static void main(String[] args) {

        Map<String, Double> employees = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter size of employee you need to enter::");
        int size = input.nextInt();

        System.out.println("Please enter employee details");

        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter The Employee Name:");
            String name = input.next();

            System.out.println("Please Enter The Employee Salary");
            Double salary = input.nextDouble();

            employees.put(name, salary);
        }

        System.out.println("-----------------Comparator sort employee by salary-----------------");

        employees.entrySet().stream().
                sorted(Map.Entry.comparingByValue()).
                forEach(_item -> System.out.println(STR."Name: \{_item.getKey()},Salary: \{_item.getValue()}"));
    }
}
