import java.util.ArrayList;

public class CSGPRecursion {
    int size;
    ArrayList<Integer> permutation = new ArrayList<>();
    ArrayList<Integer> setOfElements;
    ArrayList<Boolean> chosen = new ArrayList<>();

    public CSGPRecursion(ArrayList<Integer> setOfArrayList){
        this.setOfElements = setOfArrayList;
        this.size = this.setOfElements.size();
        for(int i=0;i<size;i++){
            chosen.add(false);
        }
    }

    void search(){
        if(permutation.size()==size){
            System.out.print("( ");
            for(Integer item: permutation){
                System.out.print(setOfElements.get(item)+" ");
            }
            System.out.println(")");
        }else{
            for(int i=0;i<size;i++){
                if(chosen.get(i)){
                    continue;
                }
                permutation.add(i);
                chosen.set(i, true);
                search();
                chosen.set(i, false);
                permutation.remove(permutation.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> setOfArrayList = new ArrayList<>();
        setOfArrayList.add(1);
        setOfArrayList.add(2);
        setOfArrayList.add(3);
        CSGPRecursion csgpRecursion = new CSGPRecursion(setOfArrayList);
        csgpRecursion.search();
    }
}
