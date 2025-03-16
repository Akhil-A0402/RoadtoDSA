package Tree.Questions;

import Tree.Impl.BuildPreOrderTree;
import Tree.Questions.HightOfTree;

public class DiameterOfTree {

    // Approach 1
    /*
     * Time complexity : O(n^2)
     * Because we are going through n time for checking diameter of tree and n times checking the height of the tree
     */
    public static int diameterOfTree(BuildPreOrderTree.Node root) {
        if(root == null) {
            return 0;
        }

        int diam1 = diameterOfTree(root.left); // Calculate the diameter of left sub tree;
        int diam2 = diameterOfTree(root.right); // Calculate the diameter of right sub tree;
        int diam3 = HightOfTree.heightOfTree(root.left) + HightOfTree.heightOfTree(root.right) + 1;

        return Math.max(Math.max(diam1, diam2), diam3);
    }


    // Approach 2
    /* In this we are going to not call the height function, rather we will be calculating the height function along with checking diameter.
     * Time complexity: O(n)
     */
    public static class TreeInfo {
        int height;
        int diameter;

        public TreeInfo(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter2(BuildPreOrderTree.Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTreeInfo = diameter2(root.left);
        TreeInfo rightTreeInfo = diameter2(root.right);
        int height = Math.max(leftTreeInfo.height, rightTreeInfo.height) + 1;

        int diam1 = leftTreeInfo.diameter;
        int diam2 = rightTreeInfo.diameter;
        int diam3 = leftTreeInfo.height + rightTreeInfo.height + 1;

        int diameter = Math.max(Math.max(diam1, diam2), diam3);
        return new TreeInfo(height, diameter);
    }

    public static void main(String[] args) {
        BuildPreOrderTree.BinaryTree bt = new BuildPreOrderTree.BinaryTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildPreOrderTree.Node root = bt.buildTree(nodes);
        System.out.println(diameterOfTree(root));

        System.out.println(diameter2(root).diameter);
    }
}
