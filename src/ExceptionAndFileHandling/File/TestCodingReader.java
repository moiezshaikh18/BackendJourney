package ExceptionAndFileHandling.File;

import java.io.FileReader;

public class TestCodingReader {
    public static void main(String[] args) {

        String filename = "java-course.txt";

        try(FileReader fileReader = new FileReader(filename)){
            int read = 0;
            do{
                read = fileReader.read();
                System.out.print( (char) read);
            }while (read > -1);
        }catch (Exception exception){
            System.out.printf("Exception occurred %s",exception.getMessage());
        }
    }
}
