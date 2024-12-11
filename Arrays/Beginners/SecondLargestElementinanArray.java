package Arrays.Beginners;

public class SecondLargestElementinanArray {

    // Two phase approach
    // In this approach we iterate through the array once to find the largest element.
    // After which we iterate through it again to find the second largest.
    // Time complexity : O(2*n) = O(n)
    // Space complexity : O(1)
    public static int twoPhaseApproach(int[] arr){
        int largest = -1, secondLargest = -1;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=largest && secondLargest<arr[i]){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
        
    }

    // One-phase approach
    public static int onePhaseApproach(int[] arr) {
        int largest = -1, secondLargest = -1;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i]<largest && secondLargest<arr[i]){
                secondLargest = arr[i];
            } 
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(twoPhaseApproach(new int[]{12, 35, 1, 10, 34, 1}));
        
        System.out.println(twoPhaseApproach(new int[]{10, 5, 10}));
        
        System.out.println(twoPhaseApproach(new int[]{10, 10, 10}));

        System.out.println(onePhaseApproach(new int[]{12, 35, 1, 10, 34, 1}));
        
        System.out.println(onePhaseApproach(new int[]{10, 5, 10}));
        
        System.out.println(onePhaseApproach(new int[]{10, 10, 10}));
    }
}
