import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        
        // Brute Force O(nlogn)
        int ans[] = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     ans[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(ans);

        // Two Pointers O(n)
        int st = 0, end = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(Math.abs(nums[st]) > Math.abs(nums[end])){
                ans[i] = nums[st] * nums[st];
                st++;
            }
            else{
                ans[i] = nums[end] * nums[end];
                end--;
            }
        } 
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
