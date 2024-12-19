package CollectionsAndGenerics.VariableArgumets;

public class VariableArguments {
    public static void main(String[] args) {
        int result = add(1,2,3,4,5,6,7,8,9);

        System.out.println(STR."Addition of all number is:: \{result}");
    }

    public static int add(int ...elements){
       int sum = 0;
       for(int _item:elements){
           sum += _item;
       }
       return sum;
    }
}
