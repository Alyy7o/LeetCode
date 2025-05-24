public class MinRotated {
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;

        // O(n)
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        // }

        // O(log n)
        int str = 0, end = arr.length-1;
        while(str <= end){
            
            if(arr[str] < arr[end]){
                min = Math.min(min, arr[str]);
            }
            
            int mid = str + (end - str)/2;
            min = Math.min(min, arr[str]);

            if(arr[mid] >= arr[str]){
                str = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return min;
    }

    public static int search(int[] nums, int target){

        int str = 0, end = nums.length-1;
        while(str <= end){
            int mid = str + (end - str)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] >= nums[str]){
                if(nums[str] <= target && nums[mid] >= target){
                    end = mid-1;
                }
                else{
                    str = mid+1;
                }
            }
            else{
                if(nums[mid] <= target && nums[end] >= target){
                    str = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,0,1,2,3};
        int target = 0;
        System.out.println(search(arr, target));
        // System.out.println(min(arr));
    }
}
