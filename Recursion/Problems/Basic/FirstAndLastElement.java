package Recursion.Problems.Basic;

public class FirstAndLastElement {

    public static int first = -1, last = -1;

    public static void firstAndLastElement(String str, int idx, char element){
        if(str.length()==idx){
            if(first!=-1 && last==-1){
                last = first;
            }
            System.out.println("First :" + first + " Last: " + last);
            return;
        }
        if(str.charAt(idx)==element){
            if(first==-1){
                first = idx;
            }else{
                last = idx;
            }
        }
        firstAndLastElement(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str = "asfsgs";
        firstAndLastElement(str, 0, 'a');
    }
}
