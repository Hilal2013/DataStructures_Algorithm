import java.util.*;

public class TwoSumOptimalSolution {


    public static void main(String[] args) {
        int[] array = {1,3, 2, 4};
        System.out.println(Arrays.toString(twoSumWithTwoPointers(array, 6)));
        System.out.println(Arrays.toString(twoSumWithHashMap(array, 6)));


    }

    public static int[] twoSumWithTwoPointers(int[] nums, int target) {

        int []  arr = new int[2];

        int first = 0;
        int second = first+1;

        while(first<second) {
            if(nums[first]+nums[second]==target){
                arr[0] = first;
                arr[1] = second;
                break;
            } else if(second==nums.length-1) {
                first++;
                second = first+1;
            } else {
                second++;
            }
        }
        return arr;
    }
    public static int[] twoSumWithHashMap(int[] array, int targetValue) {
        // Complexity of the solution is O(n) but I have space complexity of O(n)
        // create hashmap
        //im gonna create map key will be each element
        // value will be index //to get index through using get()method
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {//2 7 9 11

            int potentialMatch = targetValue - array[i];//9-2=7 if seven is exist//map contains 7
            if (map.containsKey(potentialMatch)) {
                return new int[]{i, map.get(potentialMatch)};
            } else {
                map.put(array[i], i);
            }
        }

        return new int[]{};
    }

    public static int[] findSumWithTwoPoints1(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        System.out.println(map);
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                if (nums[left] == nums[right]) {
                    result[0] = map.get(nums[left]).get(0);
                    result[1] = map.get(nums[right]).get(1);
                    return result;
                } else {
                    result[0] = map.get(nums[left]).get(0);
                    result[1] = map.get(nums[right]).get(0);
                    return result;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static int[] findSumWithTwoPoints(int[] nums, int target) {//?????/
        //    Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int[] arr = new int[2];//3 2 4
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                arr = new int[]{left, right};
                break;
            }else left++;
        }
        return arr;
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