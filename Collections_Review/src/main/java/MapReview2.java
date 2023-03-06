

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapReview2 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");
        studentsMap.put(3, "Alison");
//How to get values
        List<String> list=studentsMap.values().stream().toList();
// How to get values and sort them
        List<String> list2=studentsMap.values().stream().sorted((o1, o2) -> o1.compareToIgnoreCase(o2)).collect(Collectors.toList());
        System.out.println(list2);//[Alison, Jack, Julia]
        // How to get entry Set
Set<Map.Entry<Integer,String>> entries=studentsMap.entrySet();
        System.out.println(entries);//[1=Jack, 2=Julia, 3=Alison]

        // How to get Key set
        System.out.println("Printing key set");
        for (Integer eachKey : studentsMap.keySet()) {
            System.out.println(eachKey);
            //1
           // 2
           // 3
        }



    }

}
