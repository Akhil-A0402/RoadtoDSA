package Recursion.Basics;

public class FactorialOfN {
    public static int calcFact(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*calcFact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(calcFact(5));
    }
}
