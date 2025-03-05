package Recursion.Problems.Basic;

public class MoveAllXtoEndOfString {

    public static void moveAllXtoEndOfString(String str, int idx, String newString, int count) {
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newString += "x";
            }
            System.out.println(newString);
            return;
        }

        if(str.charAt(idx)=='x'){
            count++;
            moveAllXtoEndOfString(str, idx+1, newString, count);
        }else{
            moveAllXtoEndOfString(str, idx+1, newString+str.charAt(idx), count);
        }
    }

    public static void main(String[] args) {
        moveAllXtoEndOfString("axsaxqwsdxxzx", 0, "", 0);    
    }
}
