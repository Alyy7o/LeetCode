public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        
        int pro = 1, maxPro = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            pro *= nums[i];
            maxPro = Math.max(maxPro, pro);
            if(pro <= 0){
                pro = 1;
            }
        }
        pro = 1;
        for(int i=nums.length-1; i>=0; i--){
            pro *= nums[i];
            maxPro = Math.max(maxPro, pro);
            if(pro == 0){
                pro = 1;
            }
        }
        return maxPro;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
