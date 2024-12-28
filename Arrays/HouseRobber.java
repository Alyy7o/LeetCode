public class HouseRobber {
    public static  int rob(int[] nums) {
        int counter = 0;
        int counter2 = 1;
        int sum = 0;
        int sum2 = 0;
        while(counter < nums.length){
            sum += nums[counter];
            counter += 2;

        }
        while(counter2 < nums.length){
            sum2 += nums[counter2];
            counter2 += 2;
        }
        return Math.max(sum, sum2);
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
