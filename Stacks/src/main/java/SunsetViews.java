import java.util.*;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        System.out.println(sunsetViews(buildings,"west"));
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        Stack<Integer> stack=new Stack<>();

        stack.push(0);//bottom will be 0
        if (direction.equals("right")||direction.equals("east")){

            for (int i = 0; i<buildings.length ; i++) {

                    if (buildings[i] >=stack.peek()) {
                        stack.pop();
                        if(!stack.empty() && buildings[i]>=stack.peek()){
                            stack.pop();
                        }
                    }
                    stack.push(buildings[i]);
            }
        }
        System.out.println(stack);//[5, 4,3, 2]

        if (direction.equals("left")||direction.equals("west")){
            for (int i = buildings.length - 1; i >= 0; i--) {
                if (buildings[i] >=stack.peek()) {
                    stack.pop();
                    if(!stack.empty() && buildings[i]>=stack.peek()){
                        stack.pop();
                    }
                }
                stack.push(buildings[i]);
            }
            System.out.println(stack);//[5, 3]
        }

        return new ArrayList<Integer>();
    }
}

/*
  */