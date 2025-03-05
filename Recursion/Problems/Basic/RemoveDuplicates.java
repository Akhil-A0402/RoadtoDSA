package Recursion.Problems.Basic;

public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];
    
    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        int charAt = str.charAt(idx)-'a';
        if(map[charAt]){
            removeDuplicates(str, idx+1, newString);
        }else{
            map[charAt] = true;
            removeDuplicates(str, idx+1, newString+str.charAt(idx));
        }
    }

    public static void main(String[] args) {
        removeDuplicates("aabbccsdsf", 0, "");
    }
}
