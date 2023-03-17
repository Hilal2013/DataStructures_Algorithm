public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList mylist1=new MySinglyLinkedList();
        System.out.println(mylist1.isEmpty());//true
        for (int i = 0; i <10 ; i++) {
            mylist1.add(i);
        }

mylist1.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null

        MySinglyLinkedList mylist2=new MySinglyLinkedList();

    }
}
