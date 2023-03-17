public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList mylist1=new MySinglyLinkedList();
        System.out.println(mylist1.isEmpty());//true
        for (int i = 0; i <10 ; i++) {
            mylist1.add(i);
        }

mylist1.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null

        mylist1.deleteById(7);
        mylist1.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 8=> 9=> null// seven is gone
        System.out.println("index of 1: "+mylist1.indexOf(1));

        //  MySinglyLinkedList mylist2=new MySinglyLinkedList();



    }
}
