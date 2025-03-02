package Recursion.Basics;

public class RecursionPrint1ton {

    public static void print1ton(int i, int n) {
        System.out.println(i);
        if(i==n){
            return;
        }
        print1ton(i+1,n);
    }

    public static void main(String[] args) {
        print1ton(0, 5);
    }
}
