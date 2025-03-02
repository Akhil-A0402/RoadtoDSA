package Recursion.Basics;

public class PowerOfxOlogn {
    public static int powerOfxOlogn(int x, int n) {
        if(n==1) {
            return 1;
        }

        if(n==0) {
            return 0;
        }

        if(n%2==0){
            return powerOfxOlogn(x, n/2) * powerOfxOlogn(x, n/2);
        }else {
            return powerOfxOlogn(x, n/2) * powerOfxOlogn(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(powerOfxOlogn(2, 10));
    }
}
