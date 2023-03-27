public class UserLinkedList {

    UserNode head;
    UserNode tail;
    int size;

    public UserLinkedList() {
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertLast(UserNode node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void printNames() {
        UserNode current = head;
        while (current != null) {

            System.out.print(current.name + " => ");
            current = current.next;
            if (current == null) System.out.print("null");

        }
        System.out.println();
    }

    public void insertFirst(UserNode node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }


    }
    public void insertMiddle(UserNode node,int k){
        UserNode current = head;
        UserNode prev = head;
        int index=0;
           while(current != null){

               if(index==k){
                   node=prev.next;
                   prev.next=node;
               }
               prev=current;
               current=current.next;
               index++;


           }

    }
    public void insertMiddleWithTwoPoints(UserNode node,int k){
        UserNode slow=head;
        UserNode fast=head.next;
        int index=0;

        while (fast.next
                != null) {
            if (index == k) {
node=slow.next;


            } else if (index < k) {
                slow = slow.next;
                fast = fast.next;
                index++;
            } else {
                break;
            }
        }

    }

    void deleteByName(String name) {

        if (isEmpty()) System.out.println("List is empty!!!");
        UserNode prev = head;
        UserNode current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                if (current == head) {

                    if (head == tail) tail = null;

                    head = current.next;
                    current.next = null;
                }
                //case2:tail
                else if (current == tail) {
                    tail = prev;
                    prev.next = null;

                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;

        }

    }
}
