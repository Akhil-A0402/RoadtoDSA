package Recursion.Problems.Basic;

public class ReverseString {

    public static void printRev(String str, int idx){
        if(idx == 0) {
            return;
        }
        System.out.print(str.charAt(idx-1));
        printRev(str, idx-1);
    }

    public static void main(String[] args) {
        String str ="abcd";
        printRev(str, str.length());
    }
}
