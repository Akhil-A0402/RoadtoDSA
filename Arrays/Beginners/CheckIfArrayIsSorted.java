package Arrays.Beginners;

public class CheckIfArrayIsSorted {
    
    public static boolean arraySortedOrNot(int[] arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<=arr[i]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    // public static boolean arraySortedOrNotIterative(int[] arr) {
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i-1]<=arr[i]){
    //             continue;
    //         }else{
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        System.out.println(arraySortedOrNot(new int[] {10, 20, 30, 40, 50}));
        System.out.println(arraySortedOrNot(new int[] {90, 80, 100, 70, 40, 30}));

    }
}
