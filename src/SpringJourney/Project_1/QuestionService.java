package SpringJourney.Project_1;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[4];
    Scanner input = new Scanner(System.in);


    public void displayQuestions() {
        System.out.println("Teacher, please input the questions:");

        for (int i = 0; i < 2; i++) {

            questions[i] = new Question();

            questions[i].setId(i + 1);

            System.out.println(STR."Enter question \{i + 1}: ");
            String questionString = input.nextLine();
            questions[i].setQuestion(questionString);

            String[] options = new String[4];
            System.out.println(STR."Enter 4 options for question \{i + 1} (A, B, C, D):");
            for (int j = 0; j < 4; j++) {
                System.out.println(STR."Option \{(char) ('A' + j)}: ");
                options[j] = input.nextLine();
            }
            questions[i].setOption(options);


            System.out.println(STR."Enter the correct answer for question \{i + 1} (A, B, C, or D): ");
            String correctAnswer = input.nextLine();
            questions[i].setAnswer(correctAnswer);

            System.out.println();  // Blank line for readability
        }
    }


    public void takeQuiz() {
        System.out.println("Student please start the quiz following are the questions: ");

        int score = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println(questions[i].getQuestion());

            for (String options : questions[i].getOption()) {
                System.out.println(STR."Option \{(char) ('A' + i)}: : ");
            }

            String studentAnswer = input.nextLine();

            if (questions[i].getAnswer().equalsIgnoreCase(studentAnswer)) {
                score++;
            } else {
                System.out.println(STR."Invalid !! correct answer is : \{questions[i].getAnswer()}");
            }

            System.out.println(STR."you score \{score}  out of 4");
        }
    }

}
