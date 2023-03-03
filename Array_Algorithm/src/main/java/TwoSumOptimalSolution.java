import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TwoSumOptimalSolution {


    public static void main(String[] args) {
        int[] array=new int[]{2,7,9,11};
        System.out.println(Arrays.toString(twoSumOptimalSolution(array, 9)));//[1, 0]
    }
    public static int[] twoSumOptimalSolution(int[] array, int targetValue) {
        // Complexity of the solution is O(n) but I have space complexity of O(n)
        // create hashmap
        //im gonna create map key will be each element
        // value will be index //to get index through using get()method
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
int potentialMatch=targetValue-array[i];//9-2=7 if seven is exist//map contains 7
            if(map.containsKey(potentialMatch)){
                return new int[]{i,map.get(potentialMatch)};
            }else{
                map.put(array[i],i);
            }
        }

return new int[]{};
    }

}
/*
Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
• You may assume that each input would have exactly one solution, and you
may not use the same element twice.
• You can return the answer in any order.
• No solution will return empty array.
Example:
Input: nums = [2, 7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//array[i]+array[j]=target value
        //I can make nested loops and I can compare every item with another one//brute force solution

 */