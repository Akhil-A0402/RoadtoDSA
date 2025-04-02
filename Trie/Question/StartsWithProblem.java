package Trie.Question;

public class StartsWithProblem {
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

    public static boolean containsPrefix(String key) {
        Node current = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';
            if(current.children[idx] == null){
                return false;
            }
            current = current.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "women"};
        String key = "app";
        String key2 = "moon";
        for(int i=0;i<words.length;i++) {
            insert(words[i]);
        }

        System.out.println(containsPrefix(key));
        System.out.println(containsPrefix(key2));
    }
}
