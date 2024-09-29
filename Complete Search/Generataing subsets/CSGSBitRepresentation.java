import java.util.ArrayList;

public class CSGSBitRepresentation {
    public static void main(String[] args) {
        int n=5;
        for(int b = 0;b<(1<<n);b++){
            ArrayList<Integer> subset = new ArrayList<>();
            for(int i = 0;i<n;i++){
                if((b&(1<<i))!=0){
                    subset.add(i);
                }
            }
            System.out.print("(");
            for(Integer i:subset){
                System.out.print(i + " ");
            }
            System.out.println(")");
        }
    }
}
