public class InsertionSort {

    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length ; i++) { //iterate from index 1
            int toBeInserted=array[i]; // save ith value//temp var toBeInserted
            int j=i-1;// this is predecessor
            // start shifting operation here
            while(j>=0 && toBeInserted<array[j]){
                //if [j] greater then tobeInseted we are gonna shift it
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=toBeInserted;
        }

        return array;
    }
}
