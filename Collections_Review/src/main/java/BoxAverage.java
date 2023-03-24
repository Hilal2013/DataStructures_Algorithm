import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.io.*;

public class BoxAverage {
    public static void main(String[] args) throws IOException {
        //INPUT [uncomment & modify if required]
        ArrayList<Integer> ans=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); String S=br.readLine().trim();
        while(S.equals("FULL") ==false)
        {
            ans.add(Integer.parseInt(S)); S=br.readLine().trim();
        }
        //OUTPUT [uncomment & modify if required]

        System.out.print(boxAverage1 (ans));
    }

        public static int boxAverage (ArrayList<Integer> ans){
        //this is default OUTPUT. You can change it.
            int result = -404;

            // WRITE YOUR LOGIC HERE
            // initiliaze min and max
            int min= ans.get(0);
            int max=ans.get(0);

            // loop- find min and max
            for (Integer an : ans) {
                if(an>max) max=an;
                else if(an<min) min=an;
            }
            // return the avg of min and max
            result= (int) Math.ceil((float)(min+max)/2);//returns the smallest int value//it takes double so cast int
//A ceil() value means rounding up the decimal value to the nearest integer.
            return result;
    }

    public static int boxAverage1 (ArrayList<Integer> ans){

double result=-404;

        double min= ans.get(0);
        double max=ans.get(0);
        for (int i = 0; i < ans.size(); i++) {
            min = Math.min(ans.get(i),min);
            max = Math.max(ans.get(i),max);


        }

        result = (min + max)/2;

        System.out.println(result);
        BigDecimal bd=new BigDecimal(result);
bd.setScale(0,RoundingMode.CEILING);
      return bd.intValue();
    }


    /*Box Average
    There is a truck in which we have to keep some undecided number of different boxes with each box having some weight assigned to it.
    We can keep putting boxes in the truck until it gets full. The truck has a special feature in it.int>=0
    When it gets completely occupied it displays the message "FULL" which means that now you can't put any box in the truck.
    Among all the boxes you have to find the heaviest and the lightest box and find their average.
    It is stated that the truck will contain at least one box (in this case weight of the heaviest and the lightest box will be the same).
    Find the average value.
    Note:
    Display the average as an integer rounded off to the nearest integer value.
            A ceil() value means rounding up the decimal value to the nearest integer.
    Method/Function Description:
    In the provided code snippet, implement the provided boxAverage (...) method using the variables to print the average of the lightest and heaviest box kept in the truck. You can write your code in the space below the phrase "WRITE YOUR LOGIC HERE".
    There will be multiple test cases running so the Input and Output should match exactly as provided.
    The base Output variable result is set to a default value of -404 which can be modified. Additionally, you can add or remove these output variables.
    Input Format:
    The first line of the input contains an integer, denoting the weight of the box to be kept in the truck.
    And the input is taken until the string "FULL" is encountered.
    Sample Input:
            1  	    -- denotes the weight of the box
            2	    -- denotes the weight of the box
            28	    -- denotes the weight of the box
            8	    -- denotes the weight of the box
            34	    -- denotes the weight of the box
            5	    -- denotes the weight of the box
            6	    -- denotes the weight of the box
            FULL	-- denotes the string

                double result = 0;

            double min=0;
            double max=0;
            for (int i = 0; i < ans.size(); i++) {
                 min = Collections.min(ans);
                 max = Collections.max(ans);

                result = min + max/2;
            }
            // WRITE YOUR LOGIC HERE
            System.out.println(result);
BigDecimal bd=new BigDecimal(result);
bd.setScale(0,RoundingMode.CEILING);
            return bd.intValue();
*/

}