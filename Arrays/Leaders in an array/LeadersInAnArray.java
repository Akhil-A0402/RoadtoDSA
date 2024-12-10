import java.util.*;

public class LeadersInAnArray{

    /*
     * Given an array arr[] of size n, the task is to print all the Leaders in the array. 
     * An element is a Leader if it is greater than all the elements to its right side.
     * 
     * Note: The rightmost element is always a leader.
     */
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        Solution s = new Solution();
        ArrayList<Integer> leaders = s.leaders(arr.length, arr);
        System.out.println(leaders);

    }
}

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        // ArrayList<Integer> leaders = new ArrayList<Integer>();
        // outer: for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]<arr[j]){
        //             continue outer;    
        //         }
        //     }
        //     leaders.add(arr[i]);
        // }
        
        // return leaders;
        
        // Using Suffix Maximum
        
        int maximum = arr[n-1];
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=maximum){
                maximum = arr[i];
                leaders.add(maximum);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}