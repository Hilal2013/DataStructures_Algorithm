public class TreeApp {
    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i <11; i++) {
            tree.insert(numbers[i]);
        }


        VisualizeTree.printTree(tree.root,null,false);

//     tree.preOrderTraversal(tree.root);//10, 6, 4, 5, 8, 9, 20, 17, 42, 29, 47,
//      System.out.println();
//       System.out.println("In Order Traversal :");
//       tree.inOrderTraversal(tree.root);//4, 5, 6, 8, 9, 10, 17, 20, 29, 42, 47,
//      System.out.println();
//      System.out.println("Post Order Traversal: ");
//      tree.postOrderTraversal(tree.root);//5, 4, 9, 8, 6, 17, 29, 47, 42, 20, 10,?????
//       System.out.println();
//        System.out.println("Level Order Traversal: ");
//       tree.levelOrderTraversal(tree.root);//10, 6, 20, 4, 8, 17, 42, 5, 9, 29, 47,
        //   Task 1 : Contains Method
        System.out.println("Tree contains 1?:  " + tree.contains(42));
        // Task 2; isLeaf() method
        System.out.println("Is root leaf? :   " + tree.isLeaf(tree.root));
        tree.printLeaves(tree.root);//5, 9, 17, 29, 47,
        System.out.println();
        System.out.println("Height of the tree is: "+ tree.height(tree.root));//3

      System.out.println("Number of leaves:  " +tree.countLeaves(tree.root));//5
       System.out.println("Sum of Leaf Nodes: " + tree.findSumOfLeaves(tree.root));//107

//       // System.out.println("Sum of Node Depths is: " + tree.calculateNodeDepthSums());
      System.out.println("Sum of all node values is: " + tree.calculateNodeSums(tree.root));//197

    }
}