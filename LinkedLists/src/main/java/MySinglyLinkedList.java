public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        //create new node object from data

        Node node = new Node(data);// we wil add this new node
        if (isEmpty()) {//if the list empty
            head = tail = node;
        } else {//adding lastt?
            tail.next = node;
            tail = node;
            size++;
        }

    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {//it means head==tail//we have one node
                System.out.println(current.id + "=> null");
            } else {
                System.out.print(current.id + "=> ");
            }
            current = current.next;
        }
    }


    void deleteById(int id) {
//check if empty
        if (isEmpty()) System.out.println("List is empty!!!");
        //assign previous and current with the head
        Node prev = head;
        Node current = head;
        while (current != null) {
            if (current.id == id) {//if there is a match handle three cases
                //case1;head
                if (current == head) {
                    head = current.next;
                    current.next = null;// i need to break link//head is gone and updated thead with next value
                }
                //case2:tail
                else if (current == tail) {
                    tail = prev;
                    prev.next = null;//ex-tail will be eligible for garbage collection

                }
                //case3: middle
                else {
                    prev.next = current.next;
                    current.next = null;//current will be eligible for Garbage collection
                }
                //after deletion
                size--;
            }
            //if there is no match i need to iterate//move forward on the elements of the list
            prev = current;//if i jump next one then previous will be lost so keep the track of previous
            current = current.next;

        }

    }


    int indexOf(int id) {
        if (isEmpty()) return -1;
        int pos = 0;
        //iterate through the list
        Node current = head;

        while (current != null) {
            if (current.id == id) return pos;
            pos++;
            current = current.next;
        }
        //if i cannot find the element in this loop
        return -1;

    }

    //  Implement a method that makes the insertion into first element of LinkedList
    public void addFirst(int data) {
        //create a new node and add this node into first element
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }


    }

    public int getKthFromLast(int k) {
        Node fast = head;
        Node slow = head;

        if (isEmpty()){
            System.out.println("List is empty");
        }

        for (int i = 0; i < k - 1; i++) {//fast should  move four times it starts from 0 ;3 times will move and will acces to 4thfrom begin
            fast = fast.next;
        }
        while (fast.next != null) {//when p2 came k point p1 will start moving and p2 too
            slow = slow.next;
            fast = fast.next;

        }

        return slow.id;
    }

    public void removeKthFromLast(int k) {
        Node slow = head;
        Node fast = head;
        Node prev = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = slow.next;
        slow.next = null; //break link


    }

}
