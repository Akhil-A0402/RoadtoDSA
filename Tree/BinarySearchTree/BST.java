package Tree.BinarySearchTree;

public class BST {

    public static class  Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int val){
            this.data = val;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    // Time Complexity : O(H)
    public static boolean searchInBST(Node root,int value){
        if(root == null){
            return false;
        }

        if(root.data == value){
            return true;
        }else if(root.data>value){
            return searchInBST(root.left, value);
        }else {
            return searchInBST(root.right, value);
        }
    }

    // Deleting node
    public static Node delete(Node root, int value){
        if(root.data>value){
            root.left = delete(root.left, value);
        }else if(root.data < value) {
            root.right = delete(root.right, value);
        }
        else{
            // case 1:
            if(root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if(root.left ==null ){
                return root.right;
            }else if(root.right == null){
                return root.left;
            } 

            // case 3
            Node  IS = inOderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inOderSuccessor(Node root){
        while(root.left !=null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0;i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println(searchInBST(root, 1));
        System.out.println(searchInBST(root, 4));
        System.out.println(searchInBST(root, 10));
        root = delete(root, 1);
        inorder(root);
        root = delete(root, 10);
    }
}
