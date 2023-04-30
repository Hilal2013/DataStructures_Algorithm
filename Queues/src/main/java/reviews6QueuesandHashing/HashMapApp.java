package reviews6QueuesandHashing;

public class HashMapApp {
    public static void main(String[] args) {
        MyHashMap hm = new MyHashMap();
        hm.put(1,35);
        hm.put(3,40);
        System.out.println(hm.get(1));//35
        hm.put(1,24);
        System.out.println(hm.get(1));//24
//hm.remove(1);
      //  System.out.println(hm.get(1));//-1
        hm.put(2342,2342);
        System.out.println(hm.get(2342)); //it gives -1
        System.out.println(hm.get(1));
    }
}