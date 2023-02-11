import java.util.Arrays;

public class TwoSumTarget {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};//[0,1]
        int target = 9;
//array[i]+array[j]=target value
        //I can make nested loops and I can compare every item with another one//brute force solution
        System.out.println(findSumOfTwoNumbersTarget(nums,target));

    }

    public static String findSumOfTwoNumbersTarget(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr = new int[]{nums[i], nums[j]};
                }
            }
        }

        return Arrays.toString(arr);
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
 */