public class MissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int lar = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0) lar = Math.max(lar, nums[i]);
        }

        if(lar > nums.length){
            return 
        }

        for(int num : nums){
            if(num > 0) lar = Math.min(lar, num);
        }

    }
}
