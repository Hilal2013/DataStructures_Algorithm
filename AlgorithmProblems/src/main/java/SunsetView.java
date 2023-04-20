import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetView {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        System.out.println(sunsetViews(buildings, "west"));


    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        Stack<Integer> stack = new Stack<>();

        //im gonna push indexes so when stack.peek()
        // it will give index buildings[stack.peek] will give the height and i will campare
        if (direction.equals("right") || direction.equals("east")) {

            for (int i = 0; i < buildings.length; i++) {

                while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {
                    stack.pop();
                }
                stack.push(i);
            }
        }
        System.out.println(stack);//[1, 3, 6, 7]

        if (direction.equals("left") || direction.equals("west")) {
            int i=0;
            int step=1;

            while (i>=0&& i<buildings.length) {
                while (!stack.empty()&&buildings[i] >= buildings[stack.peek()]) {
                    stack.pop();

                }
                stack.push(i);
                i+=step;
            }

        }

        System.out.println(stack);// [1, 0]
        if (direction.equalsIgnoreCase("west")) Collections.reverse(stack);//[0, 1]
        return new ArrayList<Integer>(stack);
    }

}
