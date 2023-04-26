import java.util.*;

public class LargestRange {
    public static void main(String[] args) {
        int [] myArray=new int[]{1,11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        System.out.println(Arrays.toString(largestRange(myArray)));
    }
    public static int[] largestRange(int[] array) {
        int[] bestRange=new int[2];
        int largestRange=0;
       Map<Integer,Boolean> numsMap = new HashMap<>();
        // first make all the elements true in hashmap
        for(int i = 0; i<array.length;i++){
            numsMap.put(array[i], true);
        }

        for (int i : array) {
            if(!numsMap.get(i)) continue;
            int currentLength=1;
int left=i-1;
int right=i+1;
//find the left edge
            while(numsMap.containsKey(left)){
                numsMap.put(left,false);
                currentLength++;
                left--;
            }

            while(numsMap.containsKey(right)){
                numsMap.put(right,false);
                currentLength++;
                right++;
            }
if(currentLength>largestRange){
    largestRange=currentLength;
    bestRange=new int[]{left+1,right-1};
}
        }



int min=Integer.MIN_VALUE;

        return new int[]{};
    }
}
/*
• Write a function that takes in an array of integers and returns an array of length 2 representing the largest
range of integers contained in that array. The first number in the output array should be the first number in
the range, while the second number should be the last number in the range. A range of numbers is defined as
a set of numbers that come right after each other in the set of real integers. For instance, the output array [2,
6] represents the range {2, 3, 4, 5, 6}, which is a range of length 5. Note that numbers don't need to be sorted
or adjacent in the input array in order to form a range. You can assume that there will only be one largest
range.
 */