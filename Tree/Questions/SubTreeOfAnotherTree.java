package Tree.Questions;

import Tree.Impl.BuildPreOrderTree;

public class SubTreeOfAnotherTree {

    public static boolean isIdentical(BuildPreOrderTree.Node root, BuildPreOrderTree.Node subNode){
        if(root ==null && subNode == null){
            return true;
        }
        if(root == null || subNode == null) {
            return false;
        }

        if(root.data == subNode.data){
            return isIdentical(root.left, subNode.left) && isIdentical(root.right, subNode.right);
        }else{
            return false;
        }
    }
    
    public static boolean isSubtree(BuildPreOrderTree.Node root, BuildPreOrderTree.Node subNode){
        if(subNode == null ){
            return true;
        }
        if(root == null ){
            return false;
        }
        if(root.data == subNode.data){
            if(isIdentical(root, subNode)) {
                return true;
            }
        }
        return isSubtree(root.left, subNode) || isSubtree(root.right, subNode);
    }
    public static void main(String[] args) {
        BuildPreOrderTree.BinaryTree bt = new BuildPreOrderTree.BinaryTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildPreOrderTree.Node root = bt.buildTree(nodes);

        // int[] subNodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // BuildPreOrderTree.Node subTree = bt.buildTree(nodes);

        System.out.println(isSubtree(root, root));
    }
}