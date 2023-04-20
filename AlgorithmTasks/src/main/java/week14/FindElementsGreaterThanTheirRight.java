package week14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class FindElementsGreaterThanTheirRight {
    public static void main(String[] args) {

         int[] arr = {10, 4, 6, 3, 5};
       // int[] arr = {10, 4, 11, 3, 5};
         //int[] arr = {3, 4, 6, 8, 5};
      //  int[] arr = {3};
        System.out.println(find(arr));
    }

    public static List<Integer> find(int[] arr) {

        if (arr==null || arr.length==0) {
          return null;
        }
        Deque<Integer> stack = new LinkedList<>();
       //pop all the elements that are less than the current element
        for (int value: arr) {
            while (!stack.isEmpty() && stack.peekLast() < value) {

                    stack.pollLast();
                }
            //push current element into the stack

                stack.offerLast(value);

            }

          return (List<Integer>) stack;

    }

    @Test
    public void testFind() {
        Assertions.assertEquals(List.of(10,6,5),find(new int[]{10,4,6,3,5}));
        Assertions.assertEquals(List.of(8,1),find(new int[]{3, 4, 6, 8, 1}));
        Assertions.assertEquals(List.of(3),find(new int[]{3}));
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
 */