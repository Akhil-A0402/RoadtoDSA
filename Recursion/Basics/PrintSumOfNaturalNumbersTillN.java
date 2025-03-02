package Recursion.Basics;

public class PrintSumOfNaturalNumbersTillN {
    
    public static void sumOfNaturalNum(int i, int n, int sum) {
        if(i==n) {
            System.out.println(sum+i);
            return;
        }
        sumOfNaturalNum(i+1, n, sum+i);
    }

    public static void main(String[] args) {
        sumOfNaturalNum(1, 10, 0);
    }
}
