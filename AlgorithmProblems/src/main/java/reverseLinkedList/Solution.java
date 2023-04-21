package reverseLinkedList;

public class Solution {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();

        for (int i = 0; i < 10; i++) list.add(i);
        list.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9=> null
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();//9=> 8=> 7=> 6=> 5=> 4=> 3=> 2=> 1=> 0=> null
    }

    static void reverse(MySinglyLinkedList list) {
        Node prev = list.head;
        Node current = list.head.next;
        Node nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;//change the direction of current to prev
            prev = current;//move prev to right to current
            current = nextNode;//move current to right on the next node
        }
//adjust the tail and head
        list.tail=list.head;
        list.tail.next=null;
        list.head=prev;


    }

}
