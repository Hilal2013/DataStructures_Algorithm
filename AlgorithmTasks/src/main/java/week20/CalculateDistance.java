package week20;

public class CalculateDistance {
    public static void main(String[] args) {

        System.out.println(calculateDistance(25,4,1,-6));//26.0
        System.out.println(calculateDistance(47,43,-25,-11));//90.0
        System.out.println(calculateDistance(5,6,6,3));//3.1622776601683795

//rounding
        System.out.println(
                Math.round(calculateDistance(5, 6, 6, 3) * 10.0)
                        / 10.0);//3.2

    }

    public static Double calculateDistance(int x1, int y1, int x2, int y2){
//sqrt((x2-x1)^2 + (y2-y1)^2)
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

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