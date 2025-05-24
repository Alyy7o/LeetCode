import java.util.*;
class ProductOfThree{
    public static  int maximumProduct(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);
        int m2 = nums[n-1] * nums[n-2] * nums[n-3];
        int m1 = nums[0] * nums[1] * nums[n-1];
        return Math.max(m1, m2);
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3};
        System.out.println(maximumProduct(nums));
    }
}