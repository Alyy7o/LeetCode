import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();
    
    for (String s : strs) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        
        if (!map.containsKey(sorted)) {
            map.put(sorted, new ArrayList<>());
        }
        map.get(sorted).add(s);
    }
    
    return new ArrayList<>(map.values());
    }
}
