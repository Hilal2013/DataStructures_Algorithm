import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {
    public static void main(String[] args) {
        // create hash map
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");
        String st = "JJavva DDevelloopperr";

        System.out.println(findFirstNonRepeating(st));
    }

    public static Character findFirstNonRepeating(String str) {
        // create a map : this will cost me space complexity O(n)
        Map<Character, Integer> map = new TreeMap<>();
        //HashMap does not guarantee the insertion order whereas TreeMap maintains insertion order.
        // Since we are looking for the first non repeating char from left once we trace
        // it back it should be in the insertion order from left to right.
        int frequency = 0;
        // count the frequency of chars
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                frequency = map.get(ch);//i will update
                map.put(ch, frequency + 1);
            } else {
                map.put(ch, 1);//this the first time I have seen ch
            }
        }
        // start from the beginning and check if there is a char with frequency 1
        for (char ch : str.toCharArray()) {
            if(map.get(ch)==1){
                return ch;
            }
        }
        return null;
    }



}
