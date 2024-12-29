
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int val : nums1){
            set.add(val);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i]) && !arr.contains(nums2[i])){
                arr.add(nums2[i]);
            }
        }

        int[] ans = arr.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
}
