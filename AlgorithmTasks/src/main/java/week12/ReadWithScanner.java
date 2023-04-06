package week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWithScanner {
    public static void main(String[] args) throws FileNotFoundException {//I want to capture data file to read
        File file=new File("C:\\Users\\hilal\\IdeaProjects\\DataStructures_Algorithm\\AlgorithmTasks\\src\\main\\java\\week12\\data.txt"); //define path
        Scanner scanner=new Scanner(file);//red line =>add exception
     //   scanner.useDelimiter("\\A");//define regex//to read from the beginning to end
     //   String str=scanner.next();
      //  System.out.println(str);
        scanner.useDelimiter("\\s+");//if there is space divide from there
        List<Person> people=new ArrayList<>();
        while(scanner.hasNext()){
            String name=scanner.next();
            int age=scanner.nextInt();
            double gpa =scanner.nextDouble();
            people.add(new Person(name,age,gpa));

        }

        System.out.println(people);
//Person(name=John, age=25, gpa=3.5), Person(name=Mary, age=27, gpa=3.7), Person(name=Ally, age=33, gpa=4.7)]

        scanner.close();
    }


}
