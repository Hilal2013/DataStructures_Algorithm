import java.util.*;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
       // System.out.println(sunsetViews(buildings, "right"));

        System.out.println(sunsetViewsBruteForce(buildings));
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        Stack<Integer> stack = new Stack<>();

        stack.push(0);//bottom will be 0
        if (direction.equals("right") || direction.equals("east")) {

            for (int i = 0; i < buildings.length; i++) {

                if (buildings[i] >= buildings[stack.peek()]) {
                    stack.pop();
                    if (!stack.empty() && buildings[i] >= buildings[stack.peek()]) {
                        stack.pop();
                    }
                }
                stack.push(i);
            }
        }
        System.out.println(stack);//[5, 4,3, 2]//[1, 3, 6, 7]

        if (direction.equals("left") || direction.equals("west")) {
            for (int i = buildings.length - 1; i >= 0; i--) {
                if (buildings[i] >= buildings[stack.peek()]) {
                    stack.pop();
                    if (!stack.empty() && buildings[i] >= buildings[stack.peek()]) {
                        stack.pop();
                    }
                }
                stack.push(i);
            }

        }

        System.out.println(stack);//[5,3]// [1, 0]
        if (direction.equalsIgnoreCase("west")) Collections.reverse(stack);//[0, 1]
        return new ArrayList<Integer>(stack);
    }

    public static ArrayList<Integer> sunsetViewsBruteForce(int[] buildings) {

        ArrayList<Integer> list=new ArrayList<>();
        int max=0;
        for (int i = 0; i < buildings.length; i++) {

            for (int j = i; j < buildings.length; j++) {//i=0=>3  j=>max 5//i=1=>5
                if (buildings[j] > max) {
                    max = buildings[j];
                }

            }
            if(buildings[i]>=max){//3>5 no dont add
list.add(i);            }
        }

return list;
    }

}

/*  if (direction.equals("right")||direction.equals("east")){

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
  */