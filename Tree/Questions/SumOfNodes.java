package Tree.Questions;

import Tree.Impl.BuildPreOrderTree;

public class SumOfNodes {

    public static int sumOfNodes(BuildPreOrderTree.Node root) {
        if(root == null){
            return 0;
        }
        int sumOfLeftNode = sumOfNodes(root.left);
        int sumOfRightNode = sumOfNodes(root.right);
        return sumOfLeftNode + sumOfRightNode + root.data;
    }

    public static void main(String[] args) {
        BuildPreOrderTree.BinaryTree bt = new BuildPreOrderTree.BinaryTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildPreOrderTree.Node root = bt.buildTree(nodes);

        System.out.println(sumOfNodes(root));
    }
}
