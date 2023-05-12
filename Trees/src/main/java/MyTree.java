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
//if tree is not empty//find a place to insert//child needs to be null
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

        if (root == null) return;//termination
        System.out.print(root.value + ", "); //visit root
        preOrderTraversal(root.leftChild);//visit left subtree
        preOrderTraversal(root.rightChild);//visit right subtree

    }

    //in-order left root-right
    void inOrderTraversal(TNode root) {

        if (root == null) return;//termination
        inOrderTraversal(root.leftChild);//branch left subtree
        System.out.print(root.value + ", "); //visit root
        inOrderTraversal(root.rightChild);//branch right subtree

    }

    //in-order left root-right
    void postOrderTraversal(TNode root) {
        if (root == null) return;// termination
        postOrderTraversal(root.leftChild); // branch and finish left subtree//print it on left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.print(root.value + ", ");  // visit root
    }

    void levelOrderTraversal(TNode root) {
        //this isnot recurrisive
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value + ", ");
            //im goona put visit' children
            if (toVisit.leftChild != null) {
                queue.add(toVisit.leftChild);
            }
            if (toVisit.rightChild != null) {
                queue.add(toVisit.rightChild);
            }
        }

    }

    // Task 1- Implement contains(int value)
    public boolean contains(int value) {

        if (root == null) return false;
        TNode current = root;
        while (current != null) {
            if (value < current.value) current = current.leftChild;
            else if (value > current.value) current = current.rightChild;
            else return true;
        }
        return false;



/*
  if (root == null) {
        return false;
    } else if (root.data == value) {
        return true;
    } else {
        return contains(root.left, value) || contains(root.right, value);
    }
 */
    }

    // Task-2 Implement isLeaf(TNode node)
    public boolean isLeaf(TNode node) {

        return node.leftChild == null && node.rightChild == null;

    }

    // Task-3 Implement printLeaves(TNode node)
    public void printLeaves(TNode root) {
//post order
        if (root == null) return;
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
        if (isLeaf(root))  System.out.print(root.value + ", ");
    }

    // Task -4 Implement height(TNode root)
    int height(TNode root) {
//height Math.max(left,right)
        if(root==null) return -1;
        if(isLeaf(root)) return 0;

        return 1+Math.max(height(root.leftChild),height(root.rightChild));

    }

    // Task - 5 Implement int countLeaves(Node root) # of leaves
    int countLeaves(TNode root) {
        if(root==null) return 0;
        if(isLeaf(root)) return 1;

        return countLeaves(root.leftChild)+countLeaves(root.rightChild);
    }

    // Task-  6  Implement int findSumOfLeaves(Node root) sum of values of leaves
    int findSumOfLeaves(TNode root) {
        if(root==null) return 0;
        if(isLeaf(root)) return root.value;
        return findSumOfLeaves(root.leftChild)+findSumOfLeaves(root.rightChild);
    }

    // Task -7 Calculate node sums
    public int calculateNodeSums(TNode root) {

        if(root==null) return 0;
        return root.value+calculateNodeSums(root.leftChild)+calculateNodeSums(root.rightChild);


    }
}
