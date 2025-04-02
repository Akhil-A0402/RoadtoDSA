package Trie.Question;

public class CountUniqueSubString {

    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            for(int i=0;i<children.length;i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node current = root;
        for(int i=0;i<word.length();i++){ // O(L)
            int idx = word.charAt(i) - 'a';
            if(current.children[idx] == null) {
                current.children[idx] = new Node();
            }
            if(i == word.length()-1) {
                current.children[idx].eow = true;
            }
            current = current.children[idx];

        }
    }

    public static boolean search(String word) {
        Node current = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(current.children[idx] == null){
                return false;
            }

            if(i == word.length()-1 && current.children[idx].eow == false) {
                return false;
            }

            current = current.children[idx];
        }
        return true;
    }

    public static int countNode(Node currnet) {
        if(currnet == null) {
            return 0;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(currnet.children[i] != null) {
                count += countNode(currnet.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "ababa";
        
        for(int i = 0;i<str.length();i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNode(root));
    }
}
