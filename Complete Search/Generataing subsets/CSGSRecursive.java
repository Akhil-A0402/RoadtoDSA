import java.util.ArrayList;

public class CSGSRecursive {

    public int size;
    public ArrayList<Integer> subset = new ArrayList<>();

    CSGSRecursive(int size){
        this.size = size;
    }

    public void generateSubsetRecursive(int i){
        if(i>size){
            for(Integer element:subset){
                System.out.print(element + ", ");
            }
            System.out.println("");
            return;
        }else{
            subset.add(i);
            generateSubsetRecursive(i+1);
            subset.remove(subset.size()-1);
            generateSubsetRecursive(i+1);
        }
    }

    public static void main(String[] args) {
            CSGSRecursive instance = new CSGSRecursive(5);
            instance.generateSubsetRecursive(1);        
        }
}
