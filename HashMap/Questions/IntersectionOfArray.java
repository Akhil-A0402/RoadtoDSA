package HashMap.Questions;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfArray {
    
    public static void intersectionOfArray(int[] arr1, int[] arr2) {
        HashSet<Integer> arr1Set = new HashSet<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        for(int element: arr1) {
            arr1Set.add(element);
        }
        for (Integer integer : arr2) {
            if(arr1Set.contains(integer)){
                intersection.add(integer);
                arr1Set.remove(integer);
            }
        }

        System.out.println("Intersetion count:" + intersection.size());

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1,5,6,7};
        intersectionOfArray(arr1, arr2);
    }

}
