package Sort.QuickSort;

public class QuickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i= low-1;
        for(int j=0;j<high;j++){
            if(arr[j]<pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3, 9, 5, 2, 8};
        int n = arr.length;

        quickSort(arr, 0, n-1);

        for(int i: arr){
            System.out.print(i + ", ");
        }        
    }


}
