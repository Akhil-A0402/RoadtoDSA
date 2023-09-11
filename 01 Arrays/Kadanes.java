public class Kadanes{
    public static int kadanesFunction(int arr[]){
        // We initialize two variable 
        // 1. to get the current sum, which if less that zero is reset to 0 for adding further sum
        // 2. sum is used to store the maximum sub array value
        int curSum=0, sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            // Add the current index element to sum
            curSum+=arr[i];
            // Compare the previous sum and curSum and store the greater one in sum
            sum = Math.max(curSum, sum);
            // Incase if curSum goes below 0, reset the curSum to 0
            if(curSum<0){
                curSum = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {1, -2,-3, 4, -1, 2, 1};
        System.out.println(Kadanes.kadanesFunction(arr)); 
    }
}