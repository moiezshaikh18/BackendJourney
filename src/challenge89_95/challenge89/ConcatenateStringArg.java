package challenge89_95.challenge89;

public class ConcatenateStringArg {
    public static void main(String[] args) {
        System.out.println(concatenate("Moiz", "Husen", "Shaikh"));
    }

    public static String concatenate(String... elements) {
        // Use a String variable to hold the concatenated result
        String result = "";
        for (String item : elements) {
            result =result + (result.isEmpty() ? "" : " ") + item;
        }
        return result;
    }
}
