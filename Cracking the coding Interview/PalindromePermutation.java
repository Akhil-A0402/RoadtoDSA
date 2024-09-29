import java.util.Scanner;

public class PalindromePermutation {

    public static boolean converter(String word){
        StringBuffer sb = new StringBuffer(word);

        // int i=word.length()/2;
        // while(i>=0){
        //     char temp = sb.charAt(i);
        //     word = sb[]
        // }
        int val = word.compareTo(new String(sb.reverse()));
        return val==0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(converter(word));

    }
}
