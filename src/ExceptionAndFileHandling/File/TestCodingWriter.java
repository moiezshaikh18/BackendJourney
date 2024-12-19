package ExceptionAndFileHandling.File;

import java.io.FileWriter;

public class TestCodingWriter {
    public static void main(String[] args) {

        String filename = "java-course.txt";

        try(FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write("learning java !!!");
            for (int i = 0;i<100;i++){
                fileWriter.write("**\n");
            }
            fileWriter.flush();
            System.out.println("File written successfully");
        }catch (Exception exception){
            System.out.printf("This is IO exception %s",exception.getMessage());
        }
    }
}
