package Recursion.Problems.Basic;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintAllUniqueSubSequence {

    public  static HashSet<String> sequences = new HashSet<String>();

    public static void printAllSubSequence(String sequence, int idx, String newString, HashSet<String> uniqueList){
        if(idx == sequence.length()){
            if(uniqueList.contains(newString)){
                return;
            }else{
                uniqueList.add(newString);
                System.out.println(newString);
                return;
            }
        }
        printAllSubSequence(sequence, idx+1, newString+sequence.charAt(idx), uniqueList);
        printAllSubSequence(sequence, idx+1, newString, uniqueList);
    }

    public static void main(String[] args) {
        printAllSubSequence("aaa", 0, "", new HashSet<>());
    }
}
