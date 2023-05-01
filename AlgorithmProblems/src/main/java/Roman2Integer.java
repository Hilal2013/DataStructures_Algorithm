import java.util.HashMap;
import java.util.Map;


public class Roman2Integer {
    public static void main(String[] args) {


        System.out.println(romanToInteger("MCMXCIV"));
    }

    static int romanToInteger(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            String currentSymbol = s.substring(i, i + 1);
            int currentValue = map.get(currentSymbol);
            int nextValue = 0;
            if (i + 1 < s.length()) {
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = map.get(nextSymbol);
            }
            if (currentValue < nextValue) {
                sum += (nextValue - currentValue);
                i += 2;
            } else {
                sum += currentValue;
                i++;
            }
        }

        return sum;
    }
}