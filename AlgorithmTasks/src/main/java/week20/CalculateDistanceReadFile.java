package week20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculateDistanceReadFile {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\hilal\\IdeaProjects\\DataStructures_Algorithm\\AlgorithmTasks\\src\\main\\java\\week20\\coordinates.txt");
        String input = Files.readString(path);
        //  calculateDistance(input);
        var lines = Files.readAllLines(path);
        calculateDistanceList(lines);
    }

    public static void calculateDistance(String input) {

        String[] lines = input.split("\n");

        for (String line : lines) {
            int x2 = Integer.parseInt(line.substring(line.lastIndexOf("(") + 1, line.lastIndexOf(",")));
            int x1 = Integer.parseInt(line.substring(1, line.indexOf(",")));
            int y1 = Integer.parseInt(line.substring(line.indexOf(" ") + 1, line.indexOf(")")));
            int y2 = Integer.parseInt(line.substring(line.lastIndexOf(" ") + 1, line.lastIndexOf(")")));
            System.out.println(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        }


    }

    public static List<Double> calculateDistanceList(List<String> lines) {//???
        List<Double> list = new ArrayList<>();
        for (String line : lines) {
            //     System.out.println(file);

            var coordinates = line.split(" ");
            //System.out.println(Arrays.deepToString(coordinates));
            int x1 = Integer.parseInt(coordinates[0].substring(1,coordinates[0].length()-1));
            int y1 = Integer.parseInt(coordinates[1].substring(0,coordinates[1].length()-1));
            int x2 = Integer.parseInt(coordinates[2].substring(1,coordinates[2].length()-1));
            int y2 = Integer.parseInt(coordinates[3].substring(0,coordinates[3].length()-1));
            double distance=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            list.add(distance);
        }
        return list;
    }

}
/*
You have (x, y) coordinates for 2 points and need to find the distance between them.
Input:
Your program should read lines from the file. Each line contains two coordinate pairs which are space-delimited.
All x and y values are integers between -100 and 100.
Output:
Return the list of distance between the points. You do not need to round the results you receive.
Test 1
 (25, 4) (1, -6)
Expected Output 26.0
Test 2
 (47, 43) (-25, -11)
Expected Output 90.0
. The formula for distance between two point (x1, y1) and (x2, y2) is
Distance = $\sqrt{(x2-x1)^{2} + (y2-y1)^{2}}$
 */
/*
 for (String line : lines) {
            String[] each = line.split(" ");
            int x1 = Integer.parseInt(lines[0]);
            int x2 = Integer.parseInt(each[1]);
            System.out.println(x1);
            System.out.println(x2);

            for (String s : each) {

                //int x2 = Integer.parseInt(each[0]);


            }


            //   int y1 = Integer.parseInt(each[1]);
            //   int y2 = Integer.parseInt(each[1]);

        }
String[][] matrix=new String[2][2];
        String[] lines = input.split("\n");

        for (int i = 0; i < lines.length; i++) {
          String[] each= lines[i].split(" ");
            for (int j = 0; j < each.length; j++) {

                matrix[i][j]=each[j];
            }

        }
        int x1=Integer.parseInt(matrix[0][1]);
        int x2=Integer.parseInt(matrix[1][0]);
        int y1=Integer.parseInt(matrix[0][1]);
        int y2=Integer.parseInt(matrix[1][1]);

        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
 */