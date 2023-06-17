public class JD1MergeSort {

    public static void mergeSort(int[] array) {
//algorithm divide and conquer
        //divide array
        if (array.length < 2) return;// if you have  one element in array STOP
        int mid = array.length / 2;
        int[] leftArray = new int[mid];//size will be mid
        int[] rightArray = new int[array.length - mid];
        for (int i = 0; i < mid; i++) { //stands for leftArray
            leftArray[i] = array[i];
        }
        for (int i = mid; i < array.length ; i++) rightArray[i-mid]=array[i];
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0; // i need three pointers
        //the first one will moved on the left .Second one will be moves on the right and third one will be for result
        while (i < left.length && j < right.length) {
            //left is less than right Im going to put left element into result//so k will be increased//also i will increase
            // left is greater than right Im going to put right element into result//so k will be increased//also j will increase
            if (left[i] <= right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }
        //i can have some leftovers
        //i still less than left.length or j is still less than right.length
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }
}
