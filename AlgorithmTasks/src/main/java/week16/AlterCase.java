package week16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class AlterCase {
    public static void main(String[] args) throws IOException{
        Path path=Path.of("C:\\Users\\hilal\\IdeaProjects\\DataStructures_Algorithm\\AlgorithmTasks\\src\\main\\java\\week16\\input.txt");
       String input = Files.readString(path);

        System.out.println(alterCase(input));

    }
    public static String alterCase(String input)  {

        StringBuilder str = new StringBuilder();
        String[] lines=input.split("\n");
       // boolean upperCase = false;

        for (String line : lines) {
            int num=0;
            for (char ch:line.trim().toCharArray()) {

                if (Character.isLetter(ch)) {

                    if(num%2==0) {
                        str.append( Character.toUpperCase(ch));
                    }else {
                        str.append( Character.toLowerCase(ch));
                    }
                   num++;

                } else {//if there are numbers spaces add
                    str.append(ch);
                }

            }
            str.append("\n");//for every line
        }

        return str.toString();
    }
    @Test
public void testAlterCase()  {
        Assertions.assertEquals("We ArE tHe WoRlD",alterCase("We are the world"));
        Assertions.assertEquals("ThIs Is SoMe CoDe",alterCase("this is some code"));

}

}
/*
Given a path of input file which includes sentence(s), write a program that reads alternates the case of every
    alphabetic character, starting with uppercase. Spaces and non-alphabetical characters should be added to the
    final output as is, i.e. they should not be taken into account when alternating between upper/lowercase.
            Input: Your program should read lines from file as a standard input. Each line contains a sentence. Assume all
    characters are ASCII.
            Output: For each sentence from standard input, return a string which contains a sentence in each line such that
    the first character is uppercase, the next character is lowercase and so on.
    Test 1
    Test Input: We are the world
    Expected Output: We ArE tHe WoRlD
    Test 2
    Test Input: this is some code
    Expected Output: ThIs Is SoMe CoDe
    Please, try to test your solution via JUnit
       StringBuilder str = new StringBuilder();
        String[] lines=input.split("\n");
        boolean upperCase = false;

        for (String line : lines) {
            for (char ch:line.trim().toCharArray()) {

                if (Character.isLetter(ch)) {

                    if(upperCase) {
                        str.append( Character.toLowerCase(ch));
                    }else {
                        str.append( Character.toUpperCase(ch));
                    }
                    upperCase = !upperCase;////false=>true=>false


                } else {//if there are numbers spaces add
                    str.append(ch);
                }

            }
            str.append("\n");//for every line
        }

        return str.toString();
    }

 */