package challenge_4;

public class ConcatArrayOfWord_75 {
    public static void main(String[] args) {
        String[] arrayWord = {"moiz", "shaikh", "khan"};
        StringBuilder sb  = new StringBuilder();
        for(int i = 0;i<arrayWord.length;i++){
            sb.append(arrayWord[i] + " ");
        }

        System.out.println(">" + sb + "<");
    }
}
