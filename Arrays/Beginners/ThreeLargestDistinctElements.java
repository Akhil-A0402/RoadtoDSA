package Arrays.Beginners;

import java.util.ArrayList;
import java.util.List;

public class ThreeLargestDistinctElements {

    public static int[] getThreeLargest(int arr[]) {
        // code here
        int largest = -1, secondLargest = -1, thirdLargest = -1;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(largest!=arr[i] &&secondLargest<arr[i]){
                secondLargest = arr[i];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(largest!=arr[i] && secondLargest!=arr[i] && thirdLargest<arr[i]){
                thirdLargest = arr[i];
            }
        }
        List<Integer> listElements = new ArrayList<Integer>();
        
        // int[] elements = new int[3];
        if(largest!=-1){listElements.add(largest);}
        
        if(secondLargest!=-1){listElements.add(secondLargest);}
        
        if(thirdLargest!=-1){listElements.add(thirdLargest);}
        
        return listElements.stream().mapToInt(i -> i).toArray();
        
    }

    public static void main(String[] args) {
        int[] output = getThreeLargest(new int[]{10, 4, 3, 50, 23, 90, 90});
        for(int i=0;i<output.length;i++){
            System.out.print(output[i] + " ");
        }
    }
}