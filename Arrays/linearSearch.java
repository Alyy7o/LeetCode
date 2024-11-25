public class linearSearch {
    public static void main(String[] args) {
        
    // Linear Search Time:O(n);
        int[] arr = {1,2,6,9,2,45,8};
        int target = 45;

        for(int i=0; i < arr.length; i++){
            if (arr[i] == target) {
                System.out.println(i);
            }
        }
    }
}
