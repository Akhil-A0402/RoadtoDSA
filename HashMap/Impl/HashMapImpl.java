package HashMap.Impl;

import java.util.LinkedList;
import java.util.ArrayList;

public class HashMapImpl {
    static class HashMap<K,V>{

        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        int n, N;
        private LinkedList<Node> buckets[];

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[this.N];
            for(int i=0;i<this.N;i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        @SuppressWarnings("unchecked")
        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> bucket = buckets[bi];
            for(int i=0;i<bucket.size();i++){
                if(buckets[bi].get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0;i<N*2;i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i<oldBuckets.length;i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node n = ll.get(j);
                    put(n.key, n.value);
                }
            }
        }

        private void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di==-1){
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)N/n;

            if(lambda>2.0){
                rehash();
            }
        }

        private boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di==-1){
                return false;
            }else{
                return true;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                return null;
            }
            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                return null;
            }else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        } 

    }
    
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String,String>();
        countries.put("India", "Asia");
        countries.put("Los Angles", "North America");
        countries.put("China", "Asia");
        countries.put("Japan", "Asia");
        countries.put("Germany", "Europe");

        System.out.println(countries.get("Japan"));
        System.out.println(countries.get("Mexico"));

        System.out.println("Contains key new york" + countries.containsKey("New York"));

        System.out.println(countries.remove("China"));
        System.out.println(countries.remove("London"));

        for(String continent: countries.keySet()) {
            System.out.println(continent);
        }

    }
}
