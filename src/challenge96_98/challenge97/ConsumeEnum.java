package challenge96_98.challenge97;

public class ConsumeEnum {
    public static void main(String[] args) {

        for (Day days: Day.values()){
            System.out.printf("%s %s\n",days,days.getType());
        }
    }
}
