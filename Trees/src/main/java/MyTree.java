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
              current.leftChild=newNode;
              break;
                }//left not null branch left subtree!!!
                current=current.leftChild;
            } else {
                //if right null insert there
                if (current.rightChild == null) {
                    current.rightChild=newNode;
                    break;
                }//right not null branch right subtree!!!
                current=current.rightChild;
            }
        }


    }


}
