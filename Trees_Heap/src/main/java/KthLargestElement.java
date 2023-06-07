public class KthLargestElement {
    public static void main(String[] args) {
        int[] numbers={3,2,1,5,6,4};
        //int[] numbers={3,2,3,1,2,4,5,5,6};

        System.out.println(getKthLargest(numbers, 4));
    }
    public static int getKthLargest(int[] array, int k) {
        // create a heap//put array in a heap
        MyHeap heap = new MyHeap(array.length);
        for (int i = 0; i < array.length; i++) {
            heap.insert(array[i]);
        }

        for (int i = 0; i <k-1 ; i++) {//im gonna remeve k-1 times remove
            heap.remove();
        }
        return heap.peek();

    }
}
/*
Kth Largest Element in an Array
Medium
• Given an integer array nums and an integer k, return the kth largest element in the array.
• Note that it is the kth largest element in the sorted order, not the kth distinct element.
Example 1:
• Input: nums = [3,2,1,5,6,4], k = 2 Output: 5
Example 2:
• Input: nums = [3,2,3,1,2,4,5,5,6], k = 4 Output: 4
Constraints:
• 1 <= k <= nums.length <= 104
• -104 <= nums[i] <= 10

 PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        while(pq.size()>k){
            pq.remove();
        }
        return pq.peek();
 */