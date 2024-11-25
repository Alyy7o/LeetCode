public class SingleElementInSortedArray {

    int singleElement(int nums[]){

        int str = 0, end = nums.length-1, n = nums.length;

        if (n == 1) return nums[0];
    
        while (str <= end) {
            int mid = str + (end - str) / 2;

            if(nums[0] != nums[1] && mid == 0) return nums[mid];
            
            if(nums[n-1] != nums[n-2] && mid == n-1) return nums[mid];
            
            if (nums[mid-1] != nums[mid] && nums[mid+1] != nums[mid]) return nums[mid];

            if (mid % 2 == 0) { //even
                
                if (nums[mid-1] == nums[mid]) { // left
                    end = mid - 1;
                }
                else{ // right
                    str = mid + 1;
                }
            }
            else{ //odd
                if (nums[mid-1] == nums[mid]) { // right
                    str = mid + 1;
                }
                else{ // left
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int nums[] = {3,3,7,7,10,11,11};
        int nums[] = {1,1,2};

        SingleElementInSortedArray singleElementInSortedArray = new SingleElementInSortedArray();

        System.out.println(singleElementInSortedArray.singleElement(nums));
        
    }
}
