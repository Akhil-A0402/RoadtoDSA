import java.util.Scanner;

public class CheckPermutation {

    // 1. Sort and compare
    public static String sortArray(String word){
        char[] content = word.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    public static boolean checkPermutation(String original, String check){
        if(original.length()!=check.length()){
            return false;
        }
        return sortArray(original).equals(sortArray(check));
    }

    // 2. Using identical count
    public static boolean checkPermutation2(String original, String check){
        if(original.length()!=check.length()){
            return false;
        }

        int[] letters = new int[128];

        char[] orginal_array = original.toCharArray();
        for(char c: orginal_array){
            letters[c]++;
        }

        char[] check_array = check.toCharArray();
        for(char c: check_array){
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orginal = sc.nextLine();
        String check = sc.nextLine();
        System.out.println(checkPermutation(orginal, check)?"Yes": "No");
        System.out.println(checkPermutation2(orginal, check)?"Yes": "No");

    }
}
