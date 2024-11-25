public class RotatedArray_II {

    public boolean findTarget(int[] nums, int target){

        int str = 0, end = nums.length-1;

        while (str <= end) {
            int mid = str + (end - str) / 2;

            if(target == nums[mid]){
                return true;
            }

            if (nums[str] == nums[mid] && nums[mid] == nums[end]) {
                str++;
                end--;
            }
            else if (nums[str] <=  nums[mid]) {
                if (nums[str] <= target && target <= nums[mid]) {
                    end = mid - 1;                    
                }
                else{
                    str = mid + 1;
                }
            }
            else{
                if (nums[mid] <= target && target <= nums[end]) {
                    str = mid + 1;                    
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,1,1,1};
        int target = 0;

        RotatedArray_II rotatedArray = new RotatedArray_II();

        System.out.println(rotatedArray.findTarget(nums, target));;
    }
}
