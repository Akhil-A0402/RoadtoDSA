package Trie.Question;

public class LongestWordWithAllPrefix {
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

    public static String ans = "";

    public static void longestWordWithAllPrefix(Node root, StringBuilder temp) {
        if(root == null){
            return;
        }

        for(int i=0;i<26;i++) {
            if(root.children[i] !=null && root.children[i].eow == true){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()) {
                    ans = temp.toString();
                }
                longestWordWithAllPrefix(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"a", "ap","bananana", "app", "apple", "apply", "appl"};
        for(String word: words) {
            insert(word);
        }
        StringBuilder temp = new StringBuilder("");
        longestWordWithAllPrefix(root, temp);
        System.out.println(ans);
    }
}
