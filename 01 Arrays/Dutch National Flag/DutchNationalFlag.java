import java.util.*;

public class DutchNationalFlag {

    static void swap(int  []arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void DNF(int []arr){
        int low=0, mid = 0, high = arr.length - 1;
        while(mid<=high){
            if(arr[mid]==0){
                DutchNationalFlag.swap(arr, mid , low);
                low+=1;
                mid+=1;
            }else if(arr[mid]==1){
                mid+=1;
            }else if(arr[mid]==2){
                DutchNationalFlag.swap(arr, mid, high);
                high-=1;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,1,1,1,0,0,2,1};
        DutchNationalFlag.DNF(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }    
}
