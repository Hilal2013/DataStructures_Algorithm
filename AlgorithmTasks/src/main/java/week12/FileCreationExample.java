package week12;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
    public static void main(String[] args) {
        File myFile =new File("C:\\Users\\hilal\\Desktop\\myFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException ioe) {

        }
    }
}
