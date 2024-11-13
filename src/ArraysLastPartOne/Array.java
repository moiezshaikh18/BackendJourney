package ArraysLastPartOne;

public class Array {
    public static void main(String[] args) {
//        int[] myInt = new int[5];
//        myInt[0] = 98;
//        myInt[1] = 93;
//        myInt[2] = 94;
//        myInt[3] = 95;
//        myInt[4] = 10;

        int[] myInt = {98,45,56,4,56};
        for (int i =0;i<myInt.length;i++){
            System.out.println("myInt :"+i+" : "+myInt[i]);
        }

        String[] myString={"MOIZ","GAURISH","GIRSH","POOJA"};
        System.out.println(myString.length);
    }
}
