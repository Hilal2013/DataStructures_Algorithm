package week10;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

public class SingleNumber {
    public static void main(String[] args) {

        int[] arr = {2,2,1};
        System.out.println(singleNumberTwoPointers(arr));
        System.out.println(singleNumberWithMap(arr));

    }

    public static int singleNumberTwoPointers(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 1) {
            return nums[0];
        }
        while (left < nums.length && right >= 0) { //not to middle //left will go to end //right will go to startpoint
            if (nums[left] == nums[right] && left != right) { // values equal and they arent same index
                left++;
                right=nums.length-1; //it will return to end again
            } else if (nums[left] != nums[right] || left==right) {//values not equal or they are on same index
                right--;
            }

        }
        return nums[left];
    }

    public static int singleNumberWithMap(int[] nums) {

        Map<Integer, Integer> map = new TreeMap<>();
        int frequency = 0;
        for (int each : nums) {
            if (map.containsKey(each)) {
                frequency = map.get(each);
                map.put(each, 1 + frequency);

            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);//{1=2, 2=2, 4=1}

        return map.entrySet().stream().filter(e -> e.getValue() == 1).findAny().get().getKey();//more fast but memory more
        //or
  /*
        for(int each: nums){////memory less// but speed low
            if(map.get(each)==1){return each;}
        }
return 0;

   */
    }
    @Test
    public void testSingleNumber(){
        Assertions.assertEquals(1,singleNumberTwoPointers(new int[]{2,2,1}));
        Assertions.assertEquals(4,singleNumberTwoPointers(new int[]{4,1,2,1,2}));
        Assertions.assertEquals(3,singleNumberTwoPointers(new int[]{3}));
        Assertions.assertEquals(1,singleNumberWithMap(new int[]{2,2,1}));
        Assertions.assertEquals(4,singleNumberWithMap(new int[]{4,1,2,1,2}));
        Assertions.assertEquals(3,singleNumberWithMap(new int[]{3}));

    }

}
  /*
  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Example 1: Example 2:
Input: nums = [2,2,1] Output: 1 Input: nums = [4,1,2,1,2] Output: 4
Example 3:
Input: nums = [1] Output: 1
Constraints:
 1 <= nums.length <= 3 * 104
 -3 * 104 <= nums[i] <= 3 * 104
 Each element in the array appears twice except for one element which appears only once.
 Follow-up question: Can you implement a solution with a linear runtime complexity and use only constant
extra space?
Please, try to test your solution via JUnit and also test your solution here:
   */