public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        int str = 0, end = arr.length - 1;
        int mid;

        if (target > arr[end]) {
            System.out.println(end+1);
        }

        while (str <= end) {

            // int mid = (str+end)/2;
            mid = str + (end-str) / 2; //Optimized Approach then previous mid.

            if (arr[mid] < target) {
                str = mid+1;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
            else{
                System.out.println(mid);
            }
        }
        System.out.println(str);


    }
}
