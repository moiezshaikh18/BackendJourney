package Challenge_88;

import java.io.FileReader;
import java.util.Scanner;

public class FileChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the file name with extension want to find:");
        String filename = input.next();

        try(FileReader fileReader  = new FileReader(filename)){
            if(fileReader.ready()){
                int read = 0;
                do{
                    read = fileReader.read();
                    System.out.print( (char) read);
                }while (read > -1);
            }
        }catch (Exception e){
            System.out.printf("File not %s",e.getMessage());
        }
    }
}
