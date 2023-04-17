package week14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindElementsGreaterThanTheirRight {
    public static void main(String[] args) {

         int[] arr = {10, 4, 6, 3, 5};
        // int[] arr = {3, 4, 6, 8, 5};
      //  int[] arr = {3};
        System.out.println(find(arr));
    }

    public static List<Integer> find(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int first = 0;
        int second = 1;
        if (arr.length == 1) {
            stack.push(arr[0]);
            return new ArrayList<>(stack);
        }
        stack.push(arr[0]);//base
        while (first <= arr.length - 2 && second < arr.length) {
            if (arr[first] < arr[second] && second < arr.length) {
                if (stack.peek() < arr[second]) {
                    stack.pop();
                }
                stack.push(arr[second]);
                second++;
            }

            first++;
            second++;
        }
        stack.push(arr[arr.length - 1]);
        return new ArrayList<>(stack);
    }

    @Test
    public void testFind() {
        Assertions.assertEquals(List.of(10,6,5),find(new int[]{10,4,6,3,5}));
        Assertions.assertEquals(List.of(8,1),find(new int[]{3, 4, 6, 8, 1}));
    }

}
/*
Given an unsorted integer array, return all greater elements than all elements present to their right using
Stack.
Example:
Input: [10, 4, 6, 3, 5]
Output: [10, 6, 5]
The elements that are greater than all elements to their right are 10, 6, and 5.
10 > 4 & 10 > 6 & 10 > 3 & 10 > 5

 */