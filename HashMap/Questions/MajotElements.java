package HashMap.Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class MajotElements {

    public static ArrayList<Integer> majorElements(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele: arr){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }else{
                map.put(ele, 1);
            }
        }

        ArrayList<Integer> majorElements = new ArrayList<>();
        int n = arr.length;
        for(Integer key: map.keySet()){
            if(map.get(key)>n/3){
                majorElements.add(key);
            }
        }
        return majorElements;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,1,3,1,5,1};
        ArrayList<Integer> elements = majorElements(arr);
        for (Integer integer : elements) {
            System.out.print(integer + " ");
        }
    }
}