package Arrays.Beginners;

import java.util.ArrayList;

public class Alternateelementsofanarray {


    /*
     * Given an array arr[], the task is to print every alternate element of the array starting from the first element.
     * 
     * Input: arr[] = [10, 20, 30, 40, 50]
        Output: 10 30 50
        Explanation: Print the first element (10), skip the second element (20), print the third element (30), skip the fourth element(40) and print the fifth element(50).


        Input: arr[] = [-5, 1, 4, 2, 12]
        Output: -5 4 12

     */

     static void getAlternative(int arr[], int index, ArrayList<Integer> res){
        if(index<arr.length) {
            res.add(arr[index]);
            getAlternative(arr, index + 2 , res);
        }
     }

     static void getRecusively(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        getAlternative(arr, 0, res);
        res.forEach(element -> {System.out.print(element + " ");});
        System.out.println("----------------------");
     }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        // Approach 1
        for(int i=0;i<arr.length; i+=2){
            System.out.println(arr[i] + " ");
        }

        System.out.println("--------------------");

        // Time complexity
        // Worst-case :  O(n)
        // Space: O(1)

        // Approach 2; Recursive
        getRecusively(arr);
        // Time complexity
        // Worst-case :  O(n)
        // Space: O(n) for recursive call stack




    }
}