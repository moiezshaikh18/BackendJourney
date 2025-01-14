package SpringJourney.Project_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();

        Scanner input = new Scanner(System.in);

        System.out.println("This is the main class");
        System.out.println("Please select student or teachers dashboard \n (1).Teachers \n 2).Students)");
        int choice = input.nextInt();

        if (choice == 1) {
            questionService.displayQuestions();
            questionService.takeQuiz();
            System.out.println("Correct answer ");
        } else {
            questionService.takeQuiz();
            System.out.println("Need of improvements");
        }
    }
}
