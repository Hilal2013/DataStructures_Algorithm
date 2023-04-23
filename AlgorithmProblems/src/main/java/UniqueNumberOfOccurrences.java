import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        int[] myArray={1,2,2,1,1,3};
       // int[] myArray = {-3,0,1,-3,1,1,1,-3,10,0}
        // // int [] myArray=new int[]{1,2};
        System.out.println(uniqueOccurrences(myArray));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        // create a hashmap (Integer,Integer) (Elements, Freq.)
        Map<Integer, Integer> freq=new HashMap<>();
        // count number of occurences and put them in map
        for (int i : arr) {
            freq.put(i,freq.getOrDefault(i,0) +1);
        }
        // put the frequencies in a set find if there are any duplicated values
        Set<Integer> freqSet=new HashSet<>();
        for (Integer value : freq.values()) {
            // returns false if you add duplicate
            if (!freqSet.add(value)) return false;
        }
        // There are no duplicates , frequencies are unique..
        return true;
    }
    public static boolean uniqueOccurrences1(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        Set<Integer> set=new HashSet<>(); //wont add duplicates//same values
        for(int value:map.values()){
            set.add(value);
        }

        return map.size() == set.size();
    }

}
/*
Given an array of integers arr, return true if the number of occurrences of each value
 in the array is unique or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true


Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000
    Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            map.merge(arr[i], 1, Integer::sum);
        }
        int sizeOfMap = map.size();
        Set<Integer> disticts = map.values().stream().collect(Collectors.toSet());
        int distictsSize = disticts.size();

        return sizeOfMap==distictsSize;


 */