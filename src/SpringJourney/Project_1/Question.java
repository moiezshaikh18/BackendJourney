package SpringJourney.Project_1;

import java.util.Arrays;

public class Question {
    private int id;
    private String question;
    private String[] option = new String[4];
    private String answer;


    public Question() {

    }

    public Question(int id, String question, String[] option, String answer) {
        this.id = id;
        this.question = question;
        this.option = option;
        this.answer = answer;
    }

    public String[] getOption() {
        return option;
    }

    public void setOption(String[] option) {
        this.option = option;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return STR."Question{id=\{id}, question='\{question}', option=\{Arrays.toString(option)}, answer='\{answer}'}";
    }
}
