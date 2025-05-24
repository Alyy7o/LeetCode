import java.util.*;
class SubArray{

    public static int subArraySum(int nums[], int k){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<nums.length; i++){
            int val = k - nums[i];

            if(set.contains(val) || nums[i] == k){
                count++;
            }

            set.add(nums[i]);
        }

        return count;
    }


    public static int missingInteger(int[] nums) {
        int sum = nums[0], maxSum = Integer.MIN_VALUE;

        if(nums.length == 1){
            return nums[0]+1;
        }

        for(int i=1; i<nums.length; i++){
            maxSum = Math.max(maxSum, sum);
            if((nums[i-1]+1) == nums[i]){
                sum += nums[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        

        for(int i=0; i<nums.length; i++){
            if(nums[i] == maxSum){
                maxSum += 1;
                i = 0;
            }
        }

        return maxSum;
    }

    public static String intToRoman(int num) {
        
        
        return "yes";
    }

    public static void main(String[] args) {

        // int nums[] = {1,1,1};
        // System.out.println(subArraySum(nums, 2));

        int nums[] = {4,5,6,7,8,8,9,4,3,2,7};
        System.out.println(missingInteger(nums));
        
    }
}