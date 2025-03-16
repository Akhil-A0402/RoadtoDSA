package Tree.Questions;

public class CountOfNodes {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }


    /*
     * Time complexity: O(n)
     */
    public static int countNodes(Node node){
        if(node==null){
            return 0;
        }
        int leftNodesCount = countNodes(node.left);
        int rightNodesCount = countNodes(node.right);
        return leftNodesCount + rightNodesCount + 1;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = bt.buildTree(nodes);

        // System.out.println(root.data);
        System.out.println(countNodes(root));
    }
}
