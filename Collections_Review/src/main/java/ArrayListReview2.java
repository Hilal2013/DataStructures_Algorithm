import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReview2 {
    public static void main(String[] args) {
        //Convert an Array to ArrayList with Arrays.asList()
        Integer[] arr={7, 8, 1,2,3,4,6};
        List<Integer> list=Arrays.asList(arr);
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(arr));

        //Convert an Array to ArrayList with Collections.addAll()
        List<Integer> list3=new ArrayList<>();
        Collections.addAll(list3, arr);
        System.out.println(list3);


        //convert an ArrayList to Array
        Integer[] arr2=list3.toArray((new Integer[0]));
        System.out.println(Arrays.toString(arr2));


        //convert an ArrayList to Array using streams
        int[] arr3=list3.stream()
                .mapToInt(i->i)
                .toArray();
        System.out.println(Arrays.toString(arr3));

        // Sort without comparator
        Collections.sort(list2,Collections.reverseOrder());
       // list2.sort(Collections.reverseOrder());
        System.out.println(list2);
//[8, 7, 6, 4, 3, 2, 1]
        // Binary Search on collections//O(log n)





    }
}
