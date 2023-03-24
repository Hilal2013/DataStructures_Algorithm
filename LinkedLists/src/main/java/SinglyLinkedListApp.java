public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList mylist=new MySinglyLinkedList();
        System.out.println(mylist.isEmpty());//true
        for (int i = 0; i <10 ; i++) {
            mylist.add(i);
        }

mylist.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null

        mylist.deleteById(7);
        mylist.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 8=> 9=> null// seven is gone
        System.out.println("index of 1: "+mylist.indexOf(1));//1
        mylist.addFirst(10);
        mylist.printNodes();

          MySinglyLinkedList mylist1=new MySinglyLinkedList();
        for (int i = 0; i <10 ; i++) {
            mylist1.add(i);
        }
        mylist1.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null

        System.out.println(mylist1.getKthFromLast(4));//6
        mylist1.removeKthFromLast(4);
        mylist1.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 7=> 8=> 9=> null
    }
}
