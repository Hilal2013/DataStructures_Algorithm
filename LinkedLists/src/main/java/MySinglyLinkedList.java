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
            if (current.next == null) {
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
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k-1; i++) {//p2(fast) will move
            p2 = p2.next;
        }
        while (p2.next != null) {//when p2 came k point p1 will start moving and p2 too
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.id;
    }

    public void removeKthFromLast(int k) {
        Node p1 = head;
        Node p2 = head;
        Node prev=head;
        for (int i = 0; i < k-1; i++) {
            p2 = p2.next;
        }
        while (p2.next != null) {
            prev=p1;
            p1 = p1.next;
            p2 = p2.next;
        }

        prev.next=p1.next;
        p1.next=null; //break link




    }

}
