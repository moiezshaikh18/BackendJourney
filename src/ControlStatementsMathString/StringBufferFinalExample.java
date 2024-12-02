package ControlStatementsMathString;

public class StringBufferFinalExample {

    final String name = "John";

    public void setName(String name){
//        this.name = name;// can not use this as it name declare as final
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("First");
        sb.append(" string builder format");

        System.out.println(sb);


    }
}
