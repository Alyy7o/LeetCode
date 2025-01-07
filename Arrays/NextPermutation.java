import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) { // Time: O(n)
        
        int ind1 = -1, ind2 = -1;

        // Check Breaking point either array is sorted or not
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind1 = i;
                break;
            }
        }

        // if true than reverse or sort whole array
        if(ind1 == -1){
            reverse(nums, 0);
        }
        else{
            // check no that is smaller than last index no
            for(int i=nums.length-1; i >= 0; i--){
                if(nums[i] > nums[ind1]){
                    ind2 = i;
                    break;
                }
            }

            //  swap last index no with smaller no and then reverse 
            //  the array from next to the smaller index
            swap(nums, ind1, ind2);
            reverse(nums, ind1+1);
        }

        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void reverse(int[] nums, int i){
        int st = i, end = nums.length-1;
        while (st < end) {
            swap(nums, st, end);
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2};
        nextPermutation(nums);

    }
}
