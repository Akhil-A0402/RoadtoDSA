package Tree.Questions;

import Tree.Impl.BuildPreOrderTree;

public class HightOfTree {

    public static int heightOfTree(BuildPreOrderTree.Node root){
        if(root == null){
            return 0;
        }
        int leftNodesHight = heightOfTree(root.left);
        int rightNodesHeight = heightOfTree(root.right);
        return Math.max(leftNodesHight, rightNodesHeight)+1;
    }

    public static void main(String[] args) {
        BuildPreOrderTree.BinaryTree bt = new BuildPreOrderTree.BinaryTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildPreOrderTree.Node root = bt.buildTree(nodes);

        System.out.println(heightOfTree(root));
    }
}
