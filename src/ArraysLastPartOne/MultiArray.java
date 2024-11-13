package ArraysLastPartOne;

public class MultiArray {
    public static void main(String[] args) {
        int[][] twoArray= new int[2][3];
        int[][] arrayTwo = {{1,2,3},{4,5,6}};

        System.out.println(twoArray.length);
        System.out.println(arrayTwo.length);
        System.out.println("---------------------------------------------");
        for(int i=0;i<arrayTwo.length;i++){
            for(int j=0;j<twoArray[i].length;j++){
                System.out.println(arrayTwo[i][j]);
            }
        }
    }
}
