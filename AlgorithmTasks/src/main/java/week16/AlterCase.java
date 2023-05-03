package week16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AlterCase {
    public static void main(String[] args) {
       //String str = "We are the world";
       String str="this is some code";
        System.out.println(alterCase(str));
    }
    public static String alterCase(String s) {
        StringBuilder str = new StringBuilder(s.length());
        boolean upperCase = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                //firs character should be upper case so uppercase false =>will go else statement convert upper
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
        return str.toString();
    }
    @Test
public void testAlterCase(){
        Assertions.assertEquals("We ArE tHe WoRlD",alterCase("We are the world"));
        Assertions.assertEquals("ThIs Is SoMe CoDe",alterCase("this is some code"));

}

    public static String alterCase1(String s) {

// conver string array

        String[] str = s.split(" ");//[We, are, the, world]
        s = s.replaceAll("\\s", "");
        System.out.println(s);//Wearetheworld
        int first = 0;
        int second = first + 1;
        char[] ch = s.toCharArray();
        String result = "";
        while (first <= ch.length-1) {
            if (Character.isUpperCase(ch[0])) {//UlUl
                if(!Character.isUpperCase(ch[first])){
                    result += (char) (ch[first] - ('a' - 'A'));//firsts will be uppercase
                }else{

                    result +=(char) (ch[first]);
                }

                if(!Character.isLowerCase(ch[second])){
                    result += (char) (ch[second] + 'a' - 'A');//seconds will be lowercase
                }else{

                    result +=(char) (ch[second]);;
                }

                first++;
                first++;
                second++;
                second++;
            } else if (Character.isLowerCase(ch[0])) {
                if(!Character.isLowerCase(ch[first])){
                    result += (char) (ch[first] + 'a' - 'A');//firsts will be lowercase
                }else{

                    result +=(char) (ch[first]);
                }
                if(!Character.isUpperCase(ch[second])){
                    result += (char) (ch[second] - ('a' - 'A'));
                }else{

                    result +=(char) (ch[second]);
                }

                first++;
                first++;
                second++;
                second++;
            }
        }
        if(ch.length%2!=0){
            if(!Character.isUpperCase(ch.length-1)){
                result += (char) (ch[first] - ('a' - 'A'));
            }else{
                result+=(char) (ch[ch.length-1]);
            }
        }
        System.out.println(result);
  /*
        for (int i = 0; i < str.length; i++) {
            result += result.substring(0, str[i].length()) + " ";
            result = result.substring(str[i].length());
        }
        return result;

   */
      return result;
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
    public String toLowerCase(String s)
    for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(s.charAt(0))) {//w
                    if(upperCase) {
                        str.append( Character.toUpperCase(ch));
                    }else {
                        str.append( Character.toLowerCase(ch));
                    }
                    upperCase = !upperCase;////false=>true=>false
                }else if(Character.isUpperCase(s.charAt(0))) {
                    if(upperCase) {
                        str.append( Character.toLowerCase(ch));
                    }else {
                        str.append( Character.toUpperCase(ch));
                    }

                    upperCase = !upperCase;
                }

           } else {//if there are numbers spaces add
                str.append(ch);
            }

            }


        return str.toString();

 */