import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {

    }

    void insert(int value) {
//if tree is empty
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
//if tree is not empty
        TNode current = root;
        while (true) {
            if (value <= current.value) {
                //if left null insert there
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }//left not null branch left subtree!!!
                current = current.leftChild;
            } else {
                //if right null insert there
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }//right not null branch right subtree!!!
                current = current.rightChild;
            }
        }

    }

    //preorder root-left-right
    void preOrderTraversal(TNode root) {

        if(root==null) return;//termination
        System.out.print(root.value+", "); //visit root
        preOrderTraversal(root.leftChild);//visit left subtree
        preOrderTraversal(root.rightChild);//visit right subtree

    }
    //in-order left root-right
    void inOrderTraversal(TNode root) {

        if(root==null) return;//termination
        inOrderTraversal(root.leftChild);//branch left subtree
        System.out.print(root.value+", "); //visit root
        inOrderTraversal(root.rightChild);//branch right subtree

    }
    //in-order left root-right
    void postOrderTraversal(TNode root){
        if (root==null) return;// termination
        postOrderTraversal(root.leftChild); // branch and finish left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.print(root.value+", ");  // visit root
    }
void levelOrderTraversal(TNode root){
        //this isnot recurrisive
    if (root==null) return;
    Queue<TNode> queue=new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        TNode toVisit=queue.poll();
        System.out.print(toVisit.value+", ");
        //im goona put visit' children
        if(toVisit.leftChild!=null){
            queue.add(toVisit.leftChild);
        }
        if(toVisit.rightChild!=null){
            queue.add(toVisit.rightChild);
        }
    }

}

}
