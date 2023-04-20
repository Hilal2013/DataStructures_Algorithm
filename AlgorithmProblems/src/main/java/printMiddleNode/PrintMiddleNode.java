package printMiddleNode;

public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList sll = new MySinglyLinkedList();
        for (int i = 1; i <= 6; i++) {
            sll.add(i);
        }
        printMiddle(sll);
        printMiddleWithoutTail(sll);
    }

    public static void printMiddle(MySinglyLinkedList sll) {
//create two pointers
        Node fast = sll.head;
        Node slow = sll.head;
//iterate over the linkedlist
        while (fast != sll.tail && fast.next != sll.tail) {
            slow = slow.next;//single jump
            fast = fast.next.next;//double jump
        }
        if (fast == sll.tail) {
            System.out.println(slow.id);
        } else {
            System.out.println(slow.id + " , " + slow.next.id);
        }


    }

    public static void printMiddleWithoutTail(MySinglyLinkedList sll) {
//create two pointers
        Node fast = sll.head;
        Node slow = sll.head;
//iterate over the linkedlist
        while (fast != null && fast.next !=null) {
            slow = slow.next;//single jump
            fast = fast.next.next;//double jump
        }
        if (fast.next == null) {
            System.out.println(slow.id);
        } else {
            System.out.println(slow.id + " , " + slow.next.id);
        }


    }

}
