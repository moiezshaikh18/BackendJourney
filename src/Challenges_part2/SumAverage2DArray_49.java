package Challenges_part2;

public class SumAverage2DArray_49 {
    public static void main(String[] args) {
        System.out.println("Welcome to sum average in 2D array::");
        int[][] myArray = ArrayUtility.input2DArray();
        long sum = sum(myArray);
        double average = average(myArray);
        System.out.println("Sum of 2D array is:: "+ sum);
        System.out.println("Average of 2D array is:: "+ average);
    }

    public static double average(int[][] array){

        if(array.length == 0){
            return 0;
        }
        int row = array.length;
        int col = array[0].length;
        long size = (long) row * col;
        return (double) sum(array) / size;
    }

    public static long sum(int[][] array){
        int sum = 0;

        int i = 0;
        while(i<array.length){
            int j = 0;
            while(j<array[i].length){
                sum = sum + array[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
