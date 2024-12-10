// package 01 Arrays.Kadanes Based Questions;

// Question link
// https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118820/offering/1381872?leftPanelTab=3


public class FlipBits {

    public static int flipbitsFunction(int[] arr){
        int count = 0; // count the number of 1's
        for(int i=0;i<arr.length;i++)
            if(arr[i]==0)
                arr[i] = 1;
            else{
                arr[i] = -1;
                count++;
            }
        
        int sum = Integer.MIN_VALUE, curSum = 0;
        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            sum = Math.max(curSum, sum);
            if(sum<0){
                curSum=0;
            }
        }
        if(sum<0){
            sum = 0;
        }

        return sum+count;
    }
    public static void main(String[] args){
        int[] arr = {1 ,0 ,0, 1, 0};
        System.out.println(FlipBits.flipbitsFunction(arr));
    }
}
