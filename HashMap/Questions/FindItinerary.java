package HashMap.Questions;

import java.util.HashMap;

public class FindItinerary {
    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<String, String>();
        for(String key: tick.keySet()){
            revMap.put(tick.get(key), key);
        }

        for(String key: tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "B");
        map.put("B", "C");
        map.put("C", "D");
        map.put("D", "E");

        String start = getStart(map);

        while (map.containsKey(start)) {
            System.out.print(start + " ->  ");
            start = map.get(start);
        }

        System.out.println(start);
    }
}
