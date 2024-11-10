package FiveLectureLoopsArray;

public class FunctionsAndMethods {
    public static void main(String[] args) {

      greetingMessage("Good Morning , Moiz");
      greetingMessage("Second Time use greeting methods");
      firstPattern();
    }

    public static void greetingMessage(String message){
        System.out.println(message+"\n");
    }

    public static void firstPattern(){
        int row = 0;
        while (row<5){
            System.out.print("*");
            int col = 0;
           while (col < row){
               System.out.print("*");
               col ++;
           }
            System.out.println(" ");
            row ++;
        }
    }
}
