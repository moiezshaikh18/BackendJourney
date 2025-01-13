package SpringJourney;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int marks;
}


public class CoreJava {
    public static void main(String[] args) {

        int x = 6;
        int y = 5;
        boolean result = x < y;
        System.out.println(result);


        System.out.println("------------------Short Circuit--------------------");

        int a = 7;
        int b = 9;
        int c = 5;
        int d = 9;
        boolean data = a > b && c > d;
        boolean aur = a < b || c > d;
        System.out.println("ShotCircuit ::" + data);
        System.out.println("ShotCircuit or ::" + aur);

        System.out.println("------------ Conditional Statement -----------------");

        int conditionalA = 8;
        int cond = 6;
        if (10 > conditionalA && cond > conditionalA) System.out.println("Hello");
        else {
            System.out.println("bye");
        }

        System.out.println("--------------Ternary Operator --------------");

        int isNumber = 10;
        System.out.println(isNumber % 2 != 0 ? "even" : "odd");

        System.out.println("--------------- Switch Statement ---------------");

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of day :");
//        int dayNum = input.nextInt();

//        switch (dayNum) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("MWednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Wrong day input");
//        }

        System.out.println("--------------- multi dimensional array ---------------");

        int[][] multiArray = new int[4][4];

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.println(STR."Please enter the row \{i} and coloum \{j}");
//                multiArray[i][j] = input.nextInt();
//            }
//        }
//
//        printArray(multiArray);

//        Student s1 = new Student();
//        s1.rollno = 10;
//        s1.name = "Gaurish";
//        s1.marks = 85;
//
//        Student s2 = new Student();
//        s2.rollno = 11;
//        s2.name = "Girish";
//        s2.marks = 95;
//
//        Student s3 = new Student();
//        s3.rollno = 12;
//        s3.name = "Moiz";
//        s3.marks = 75;
//
//
//        Student[] students = new Student[3];
//
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].rollno + " " + students[i].name + " " + students[i].marks);
//        }

        System.out.println("----------------------------------- String/Buffer/Reader ----------------------------");

        StringBuffer sb = new StringBuffer("Moiz"); // thread safe
        sb.append(" Shiakh");
        System.out.println(sb.capacity() + " " + sb.length());
        System.out.println(sb);

        StringBuilder stringBuilder = new StringBuilder(); // not thread safe

        System.out.println("data changes");

        System.out.println("reemerge");
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(STR."multi array is: \{array[i][j]}");
            }
        }

        System.out.println("----------------- Array --------------------------");

        int[] num = {1, 12, 15, 54, 5};

        for (int _item : num) {
            System.out.println("Element of and array : " + _item);
        }

    }
}
