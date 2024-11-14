package Challenges_part2;

public class SumOfArrayElement_40 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum of average");
        int[] myArray = ArrayUtility.inputArray();
        int sumArray = SumOfArrayElement(myArray);
        System.out.println("Sum Of Array elements:"+ sumArray);
        double averageArray = AverageOfArrayElement(myArray);
        System.out.println("Sum Of Array elements:"+ averageArray);
    }

    public static int SumOfArrayElement(int[] array){
        int sum=0;
        for(int obj:array){
            sum = sum +obj;
        }

        return sum;
    }

    public static double AverageOfArrayElement(int[] array){
        double sum=SumOfArrayElement(array);
       return sum/array.length;
    }
}
