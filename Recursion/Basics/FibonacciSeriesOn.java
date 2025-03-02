package Recursion.Basics;

public class FibonacciSeriesOn {
    public static void printFib(int a, int b, int n) {
        if(n==0){
            return;
        }
        System.out.println(a+b);
        printFib(b, a+b, n-1);
    }
    public static void main(String[] args) {
        int a=0, b=1, n=7;
        System.out.println(a);
        System.out.println(b);
        printFib(0, 1, n);
    }
}
