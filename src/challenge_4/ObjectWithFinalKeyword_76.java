package challenge_4;

public class ObjectWithFinalKeyword_76 {

    String name;
    int age;

    public ObjectWithFinalKeyword_76(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ObjectWithFinalKeyword_76{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        ObjectWithFinalKeyword_76 obj = new ObjectWithFinalKeyword_76("Moiz",32);
        System.out.println(obj);
    }
}
