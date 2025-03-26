package HashMap.Questions;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArrays {

    public static void unionOfArrays(int[] arr1, int[] arr2) {
        HashSet<Integer> union = new HashSet<>();
        for(int element : arr1){
            union.add(element);
        }
        for(int element: arr2){
            union.add(element);
        }
        for(int element:union){
            System.out.print(element+" ");
        }
        System.out.println("\nSize: " + union.size());
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,6,3};
        int arr2[] = {3,4,5,6,7};
        unionOfArrays(arr, arr2);
    }
}
