public class PeakIndexInMountainArray {

    public int returnElement(int[] nums){

        // int str = 0, end = nums.length-1; 
        // we can't start str from 0 and end from n-1 as it can overflow in case of mid at 1st or last element
        // and mountain will always exist so first and last element can not be peak elements
        int str = 1, end = nums.length-2;
        while (str <= end){

            int mid = str + (end - str) / 2;
            
                if (nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]) {
                    return nums[mid]; 
            }
            else{

                if (nums[mid-1] < nums[mid] ) {
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
        // int nums[] = {0,3,8,9,5,2};
        int nums[] = {3,5,3,2,0};

        PeakIndexInMountainArray peakIndexInMountainArray = new PeakIndexInMountainArray();
        
        System.out.println(peakIndexInMountainArray.returnElement(nums));

    }
}
