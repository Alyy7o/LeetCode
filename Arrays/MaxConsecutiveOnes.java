public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int l = 0, r = 0, maxLen = Integer.MIN_VALUE, zero = 0;

        while(r < nums.length){
            if(nums[r] == 0){
                zero++;
            }
            while(l < r && zero > 0){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }
            if(zero == 0){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
        }
        if(maxLen == Integer.MIN_VALUE) return 0;
        return maxLen;
    }
}
