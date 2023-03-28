package week11;

public class MyLinkedList {
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        this.size = 0;
    }

    boolean isEmpty() {
            return head == null;
    }
    void addNodes(Node node) {

        if (isEmpty()){
           head=tail=node;
        }else{
            tail.next=node;
            tail=node;
            size++;
        }

    }
    void printMyList() {
        Node current=head;

while(current!=null){

    System.out.print(current.data+" => ");
    current=current.next;
    if (current == null) System.out.print("null");
}
        System.out.println();
    }

    void deleteNNodesAfterMNodes(int n, int m) {
        Node current=head;
        Node prev=head;

        while(current!=null){

            for (int i = 1; i <= m; i++) {//m times current will go
            prev=current;
                current=current.next;
        }
            if (current == null) {return;}
            for (int i = 1; i <=n ; i++) {//n times removing
                prev.next=current.next;
                current=current.next;
                size--;

            }

            }
        }

}
