package Recursion.Basics;

public class PowerOfxOn {

    public static int powerOfxOn(int x, int n) {
        if(n==1) {
            return 1;
        }

        if(n==0) {
            return 0;
        }

        int xPowernm1 = powerOfxOn(x, n-1);
        int xPow = x* xPowernm1;
        return xPow;
    }

    public static void main(String[] args) {
        System.out.println(powerOfxOn(2, 10));
    }
}
