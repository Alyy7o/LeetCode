import java.util.HashMap;
import java.util.Map;

public class Top_K_freq_347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.replace(num, map.get(num), map.get(num)+1);
            }
            map.putIfAbsent(num, 1);
        }

        int no = 0;
        while(no < k){
            int maxVal = Integer.MIN_VALUE;
            int maxKey = 0;
            for(Map.Entry<Integer,Integer> val : map.entrySet()){
                if(val.getValue() > maxVal){
                    maxVal = val.getValue();
                    maxKey = val.getKey();
                }
            }
            map.remove(maxKey);
            ans[no] = maxKey;
            no++;
        }

        return ans;
    }
}



