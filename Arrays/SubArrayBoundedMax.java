public class SubArrayBoundedMax {
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0, low = 0, mid = 0;
        for(int num : nums){
            if(num > right) mid = 0;
            else ans += ++mid;

            if(num >= left) low = 0;
            else ans -= ++low;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,9,2,5,6};
        int left = 2;
        int right = 8;
        System.out.println(numSubarrayBoundedMax(nums, left, right));
    }
}
