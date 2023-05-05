package week12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        Path path=Path.of("C:\\Users\\hilal\\IdeaProjects\\DataStructures_Algorithm\\AlgorithmTasks\\src\\main\\java\\week12\\input.txt");
     String str=   Files.readString(path);//it wants path object//throw exception
        System.out.println("str= "+str);

      List<String>lines= Files.readAllLines(path);//returns list of String
        System.out.println(lines);//[1000 a big surprise 2000, hello, this is a big surprise 1000]
//        Path path=Path.of("C:\\Users\\hilal\\IdeaProjects\\DataStructures_Algorithm\\AlgorithmTasks\\src\\main\\java\\week12\\world.txt");
//
//        String writeString="Hello World Cydeo";
//        Files.writeString(path,writeString, StandardOpenOption.CREATE);//define your path,string and last one enum

    }
}
