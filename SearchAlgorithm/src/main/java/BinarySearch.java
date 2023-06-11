import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
        System.out.println(binarySearchIterative(numbers, 6));
            System.out.println(binarySearchRecursive(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers,6));

    }

    public static int binarySearchIterative(int[] array, int data) {
        int left = 0;
        int right = array.length - 1;
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (data == array[middle]) {
                return middle;
            } else if (data < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }
        return -1;//data couldn't be found

    }

    public static int binarySearchRecursive(int[] array, int data) {
        return binarySearchRecursive(array,data,0, array.length-1);

    }

    public static int binarySearchRecursive(int[] array, int data, int left, int right) {
        if (left > right) return -1;//it means two pointer across the each other//termination
        int middle = (left + right) / 2;
        if (array[middle] == data) return middle;
        if (data < array[middle]) {
            return binarySearchRecursive(array, data, left, middle - 1);
        } else {
            return binarySearchRecursive(array, data, middle + 1, right);
        }


    }

}
