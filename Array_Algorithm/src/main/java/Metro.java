import java.util.ArrayList;
import java.util.Arrays;

public class Metro {
    public static void main(String[] args) {
        ArrayList<int[]> stops = new ArrayList<int[]>();
        stops.add(new int[] {10,0});
        stops.add(new int[] {3,5});
        stops.add(new int[] {2,5});
        System.out.println(countPassengers(stops));//5
        System.out.println(countPassengersWithStream(stops));
    }
    public static int countPassengers(ArrayList<int[]> stops) {
        int sumGetInBus = 0;
        int sumGetOffBus = 0;
        int countOfPassengers=0;
        for (int i = 0; i < stops.size(); i++) {
           sumGetInBus+=stops.get(i)[0];//stops arraylist ->to access array get(i)->first index of array[0]
           sumGetOffBus+=stops.get(i)[1];
        }
        countOfPassengers=sumGetInBus-sumGetOffBus;

        return countOfPassengers;
//2. What is the time complexity of your solution?
       // time complexity=>  O(n)
    }
    //solution with stream
    public static int countPassengersWithStream(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])//inside arraylist object to get array ints 10-0, 3-5,2-5
                .sum();//10-2-5
    }



}
/*
1. There is a bus moving in the city, and it takes and drop some people in each bus stop.
You are provided with a list (or array) of integer pairs. Elements of each pair represent number of people
get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.
Your task is to return number of people who are still in the bus after the last bus station (after the last
array). Even though it is the last bus stop, the bus is not empty and some people are still in the bus, and
they are probably sleeping there :D
Take a look on the test cases next page.
Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So
the return integer can't be negative.
The second value in the first integer array is 0, since the bus is empty in the first bus stop.
2. What is the time complexity of your solution?

 */