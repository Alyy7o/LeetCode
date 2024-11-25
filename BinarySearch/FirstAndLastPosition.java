import java.util.Arrays;

public class FirstAndLastPosition {

    public int[] position(int[] arr, int target){

        int str = 0, end = arr.length-1;
        int[] ans = {-1,-1}; 

        // Time: O(logn)
        while (str < end) {

            if (arr[str] == target && arr[end] == target) {
                ans[0] = str;
                ans[1] = end;
                return ans;
            }
            else if(arr[str] == target && arr[end] != target){
                end--;
            }
            else if(arr[str] != target && arr[end] == target){
                str++;
            }
            else{
                str++;
                end--;
            }
        }
        return ans;

        // while (str<=end) {
        //     int mid = str + (end-str)/2;

        //     if (target > arr[mid]) {
        //         str = mid+1;
        //     }
        //     else if(target < arr[mid]){
        //         end = mid-1;
        //     }
        //     else if(arr[str] == target && arr[end] == target){
        //         ans[0] = str;
        //         ans[1] = end;
        //         return ans;
        //     }
        //     else if(arr[str] == target && arr[end] != target){
        //         end--;
        //     }
        //     else if(arr[str] != target && arr[end] == target){
        //         str++;
        //     }
        // }
        // return ans;
    }
    public static void main(String[] args) {

        FirstAndLastPosition pos = new FirstAndLastPosition();

        int[] arr = {5,7,7,8,8,10};
        int target = 7;

        System.out.println(Arrays.toString(pos.position(arr, target)));
    }
}
