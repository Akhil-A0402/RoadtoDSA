import java.util.Scanner;

public class IsUnique{
    public IsUnique(){}

    public static boolean checkUnique(String s){
        if (s.length()>128){
            return false;
        }
        boolean arr[] = new boolean[128];
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i);
            if(arr[index]){
                return false;
            }else{
                arr[index]=true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(checkUnique(input)?"Unique":"Not unique");
        sc.close();
    }
}