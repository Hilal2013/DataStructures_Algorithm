public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList mylist=new MySinglyLinkedList();
        System.out.println(mylist.isEmpty());//true
        for (int i = 0; i <10 ; i++) {
            mylist.add(i);
        }

mylist.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null
mylist.add(6);//0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> 6=> null
        mylist.printNodes();
        mylist.deleteById(6);
        mylist.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 8=> 9=> null// seven is gone
        System.out.println("index of 1: "+mylist.indexOf(1));//1
        mylist.addFirst(10);
        mylist.printNodes();//10=> 0=> 1=> 2=> 3=> 4=> 5=> 6=> 8=> 9=> null

          MySinglyLinkedList mylist1=new MySinglyLinkedList();
        for (int i = 0; i <10 ; i++) {
            mylist1.add(i);
        }
        mylist1.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null

        System.out.println(mylist1.getKthFromLast(4));//6
        mylist1.removeKthFromLast(4);
        mylist1.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 7=> 8=> 9=> null
mylist1.add(9);
mylist.add(10);
mylist1.add(10);
        mylist1.printNodes();
mylist1.removeDuplicates();
        mylist1.printNodes();
    //   mylist1.reverseList();
    //    mylist1.printNodes();
    }
}
