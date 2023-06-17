public class JD2QuickSort {


    public static void qSort(int[] array, int start, int end){
        if (start>=end) return; //termination//I have only one element
        int boundary=partition(array, start, end);
        qSort(array, start, boundary-1);// call qSort for left part
        qSort(array,boundary+1, end);// call qSort for right part
    }
    public static int partition(int[] array, int start, int end){
        int pivot=array[end];
        int boundary=start;
        for (int i = start; i <=end ; i++) {
            if(array[i]<=pivot) swap(array, i, boundary++);
        }
        return boundary-1; //will be pivot

    }
    public static void swap(int[] array, int idx1, int idx2) {
        int temp=array[idx1];
        array[idx1]=array[idx2];
        array[idx2]=temp;


    }


    }
