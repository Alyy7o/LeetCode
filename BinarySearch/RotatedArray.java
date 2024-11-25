public class RotatedArray {

    public int findTarget(int[] nums, int target){

        int str = 0, end = nums.length-1;

        while (str <= end) {
            int mid = str + (end - str) / 2;

            if(target == nums[mid]){
                return mid;
            }

            if (nums[str] <= nums[mid]) {
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
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 3;

        RotatedArray rotatedArray = new RotatedArray();

        System.out.println(rotatedArray.findTarget(nums, target));;
    }
}
