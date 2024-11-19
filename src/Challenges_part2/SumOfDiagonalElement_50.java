package Challenges_part2;

public class SumOfDiagonalElement_50 {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum");
        int[][] myArray = ArrayUtility.input2DArray();
        long sum = SumOfDiagonalElement(myArray);
        System.out.println("Sum of diagonal array is::: "+ sum);
    }

    public static long SumOfDiagonalElement(int[][] array){
        long leftSum = sumOfLeftDiagonal(array);
        long rightSum= sumOfRightDiagonal(array);
        long sum = leftSum + rightSum;
        if(array.length %2 != 0){
            int ind = array.length /2;
            sum -= array[ind][ind];
        }
        return sum;
    }

    public static long sumOfLeftDiagonal(int[][] array){
        long sum = 0;
        int i = 0;

        while(i< array.length){
            sum = sum + array[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int[][] array){
        long sum = 0;
        int i = 0;
        while(i<array.length){
            int col = array.length - 1 -1;
            sum = sum + array[i][col];
            i++;
        }
        return sum;
    }
}
