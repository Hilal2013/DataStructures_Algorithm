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
            //  node.next=null;

        }
        size++;
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
            size++;
        }


    }

    public void addMiddle(int id,int k){
        Node node = new Node(id);
        Node prev = head;
        Node current = head;
  int size=0;
        while(current!=null){
            if(size==k){
                prev.next=node;
                node.next=current;
            }
            prev=current;
            current=current.next;
            size++;
        }

    }

    public int getKthFromLast(int k) {
        Node fast = head;
        Node slow = head;

        if (isEmpty()) {
            System.out.println("List is empty");
        }

        for (int i = 0; i < k - 1; i++) {//fast should  move 3 times
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

    void removeDuplicates() {

        Node current = head;
        while (current != null && current.next != null) {
            if (current.id == current.next.id)
                current.next = current.next.next;
            else
                current = current.next;
        }

    }
    public boolean isPalindrome(Node head) {



        return false;
    }
    void reverseList() {
        Node current = head;
        Node previous = null;



        if(head == null || head.next == null){
          //  return null;
        }

        while(current!=null){
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
     //   return previous;

    }


    public Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null && list2 != null) {
            return list2;
        }//if list1 is nul just add/return list2
        if (list1 != null && list2 == null) {
            return list1;
        }


        while (list1 != null && list2 != null) {
            if (list1.id <= list1.id) {

            }
        }

        return null;

    }
}
/*
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy= new ListNode(0);
        ListNode current= dummy;
        while(list1 !=null && list2 !=null){
            if(list1.val <= list2.val) {
                current.next=list1;
                list1=list1.next;
            }
            else {
                current.next=list2;
                list2= list2.next;
            }
            current =current.next;
        }
        current.next= list1 ==null? list2: list1;
        return dummy.next;
    }

    ListNode i = list1,j=list2;
        ListNode head = null,tail=null;
        while((i!=null) && (j!=null)){
            if(i.val<=j.val){
                if(head == null){
                    head = i;
                    tail = i;
                    i  = i.next;
                }else{
                    tail.next = i;
                    tail = tail.next;
                    i = i.next;
                }
            }else{
                if(head == null){
                    head = j;
                    tail = j;
                    j  = j.next;
                }else{
                    tail.next = j;
                    tail = tail.next;
                    j = j.next;
                }
            }
        }
        while(i!=null){
            tail.next=i;
            tail = tail.next;
            i = i.next;
        }
        while(j!=null){
            tail.next=j;
            tail = tail.next;
            j = j.next;
        }
        return head;

       public boolean isPalindrome(ListNode head) {
        String str = "";
        ListNode l = head;
        while(l != null){
            str += String.valueOf(l.val);
            l=l.next;
        }
        int low=0;
        int high=str.length()-1;
        while(low<=high){
            if(str.charAt(low) != str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
 public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, dummy = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        slow = slow.next;

        while(slow!=null){
            if(dummy.val != slow.val)
                return false;
            dummy = dummy.next;
            slow = slow.next;
        }
        return true;

    }
    public ListNode reverse(ListNode head){
        ListNode curr = head, prev = null, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

 */