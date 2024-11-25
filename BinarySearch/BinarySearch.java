public class BinarySearch{

    public int binarySearch(int[] arr, int target){

        int str = 0, end = arr.length - 1;
        while (str <= end) {

            // int mid = (str+end)/2;
            int mid = str + (end-str) / 2; //Optimized Approach then previous mid.

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                str = mid+1;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
        }

        return -1;
    }

    public int RecursionBinary(int[] arr, int target, int str, int end){

        int mid = str + (end-str) / 2; //Optimized Approach then previous mid.

        if (str <= end) {
            
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                return RecursionBinary(arr, target, mid+1, end);
                
            }
            else if (arr[mid] > target) {
                return RecursionBinary(arr, target, str, mid-1);
            }
        }

            return -1;
    }
    public static void main(String[] args) {

        BinarySearch bin = new BinarySearch();

        int[] arr = {-1,0,3,4,5,9,12};
        int target = 90;
        
        System.out.println(bin.binarySearch(arr,target));
        
        target = 122;
       int str = 0, end = arr.length-1;
       System.out.println(bin.RecursionBinary(arr,target,str,end));

    }
}