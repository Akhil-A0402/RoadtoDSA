package Recursion.Problems.Basic;

public class PrintAllSubSequence {


    public static void printAllSubSequence(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char letter = str.charAt(idx);
        printAllSubSequence(str, idx+1, newString+letter);
        printAllSubSequence(str, idx+1, newString);
        
    }

    public static void main(String[] args) {
        printAllSubSequence("abc", 0, "");
    }
}
