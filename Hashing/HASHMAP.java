
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HASHMAP {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("pak", 120);
        map.put("china", 140);
        System.out.println(map);

        System.out.println(map.get("pak"));

        System.out.println(map.containsValue(120));
        
        // for(Map.Entry<String, Integer> val : map.entrySet()){
        //     System.out.println(val.getKey() + " " + val.getValue());
        // }

        // Set<String> keys = map.keySet();
        // for(String key : keys){
        //     System.out.println(key);
        // }

    }
}
