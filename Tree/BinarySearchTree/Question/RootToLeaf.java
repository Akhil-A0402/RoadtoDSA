package Tree.BinarySearchTree.Question;

import Tree.BinarySearchTree.BST;

import java.util.ArrayList;

public class RootToLeaf {

    public static void rootToLeaf(BST.Node root, ArrayList<Integer> path){
        
        if(root == null ){
            return;
        }
        
        path.add(root.data);

        
        if(root.left == null && root.right == null) {
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        } else {
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        BST.Node root = null;

        for(int i=0;i<values.length; i++){
            root = BST.insert(root, values[i]);
        }

        rootToLeaf(root, new ArrayList<Integer>());
        
    }
}
