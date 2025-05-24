import java.util.HashSet;

public class Longest_Consecutive_Sequence_128 {

    public static int longestConsecutive(int[] nums) {
        int len = 1, maxLen = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-1; j++){
                if(nums[i+1] == nums[j]+1){
                    len++;
                    maxLen = Math.max(maxLen, len);
                }
                else{
                    len = 1;
                }
            }
        }
        return maxLen;
    }
    // public static int longestConsecutive(int[] nums) {
    //     HashSet<Integer> set = new HashSet<>();
    //     int sml = Integer.MAX_VALUE;

    //     for(Integer elm : nums){
    //         set.add(elm);
    //         if(elm < sml) sml = elm;
    //     }

    //     int len = 0, maxLen = 0;
    //     for(Integer elm : set){
    //         System.out.println(elm);
    //         if(sml == elm){
    //             len++;
    //             sml = elm+1;
    //             // System.out.println(sml);
    //             // set.remove(elm);
    //             maxLen = Math.max(maxLen,len);
    //         }
    //         else{
    //             len = 0;
    //         }
    //     }
    //     return maxLen;
    // }

    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        // int nums[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
