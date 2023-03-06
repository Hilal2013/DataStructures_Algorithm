import java.util.*;
import java.util.stream.Collectors;

public class MergeSameItems {
    public static void main(String[] args) {
       int[][] items1 = {{1,1},{4,5},{3,8}};
        int[][]  items2 = {{3,1},{1,5},};
        System.out.println(mergeSimilarItems(items1,items2));
        int[][] items3 = {{1,1},{3,2},{2,3}};
        int[][] items4 = {{2,1},{3,2},{1,3}};
        System.out.println(mergeSimilarItems(items4,items3));//[[1, 4], [2, 4], [3, 4]]

        int[][] items5 = {{1,3},{2,2}};
        int[][] items6 = {{7,1},{2,2},{1,4}};
        System.out.println(mergeSimilarItems(items5,items6));//[[1, 7], [2, 4], [7, 1]]
    }
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>>  list=new ArrayList<>();

Map<Integer,Integer> map=new TreeMap<>();
        for (int[] item : items1) {
            map.put(item[0],item[1]);
        }
        System.out.println(map);//{1=1, 3=8, 4=5}//sorted
        for (int[] item : items2) {
            if(map.containsKey(item[0])){
                map.put(item[0],map.get(item[0])+item[1]);
            }else{
                map.put(item[0],item[1]);
            }
        }
        System.out.println(map);//{1=6, 3=9, 4=5}
        for (Map.Entry<Integer, Integer> each : map.entrySet()) {
list.add(new ArrayList<>(Arrays.asList(each.getKey(),each.getValue())));
        }

     //   return new ArrayList<>(new ArrayList<>());
        return list;//[[1, 6], [3, 9], [4, 5]]
    }
}