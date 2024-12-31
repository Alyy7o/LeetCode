import java.util.ArrayList;
import java.util.Arrays;

public class Insertion_II {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int p1 = 0, p2 = 0;
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] == nums2[p2]){
                arr.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1] > nums2[p2]){
                p2++;
            }
            else{
                p1++;
            }
        }

        int[] ans = arr.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
}
