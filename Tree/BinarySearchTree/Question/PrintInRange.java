package Tree.BinarySearchTree.Question;

import Tree.BinarySearchTree.BST;

public class PrintInRange {

    public static void printInRange(BST.Node root, int X, int Y) {
        if(root == null ){
            return;
        }
        if(root.data>= X && root.data<=Y){
            printInRange(root.left, X, Y);
            System.out.println(root.data);
            printInRange(root.right, X, Y);
        }else if(root.data >= Y) {
            printInRange(root.left, X, Y);
        }else {
            printInRange(root.right, X, Y);
        }
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,6,7};
        BST.Node root = null;

        for(int i=0;i<values.length; i++){
            root = BST.insert(root, values[i]);
        }

        printInRange(root, 2, 6);
    }
}
