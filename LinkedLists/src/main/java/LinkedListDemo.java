import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {

        //Node node1=new Node(1);
        //     System.out.println(node1);// Node@6d03e736 address
        //  System.out.println("Next address is= "+node1.next);//Next address is= null

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("Node1's address is: " + node1 + " Node1' next address is " + node1.next);
        // Node1's address is: Node@6d03e736 Node1' next address is Node@568db2f2
        System.out.println("Node2's address is: " + node2 + " Node2' next address is " + node2.next);
        //Node2's address is: Node@568db2f2 Node2' next address is Node@1d81eb93
        System.out.println("Node3's address is: " + node3 + " Node3' next address is " + node3.next);
        //Node3's address is: Node@1d81eb93 Node3' next address is Node@7291c18f
        System.out.println("Node4's address is: " + node4 + " Node4' next address is " + node4.next);
//Node4's address is: Node@7291c18f Node4' next address is null

        Node current;
        Node head = node1;
        current = node1;//current is referring to my head

        while (current != null) {
            System.out.println("Id of node is: " + current.id);
            current = current.next;//I hump to next one
        }
//        Id of node is: 1
//        Id of node is: 2
//        Id of node is: 3
//        Id of node is: 4

    }
   // ArrayList<Node> nodeArrayList=new ArrayList<>();

}
