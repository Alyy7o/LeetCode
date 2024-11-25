public class reverseArray {

    public void reverseArrayy(int[] arr, int size){

    // Reverse Array using 2 pointers Time: O(n);
        int start = 0, end = arr.length-1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        
        int[] arr = {3,1,7,9,23};
        int size = arr.length;

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        reverseArray rv = new reverseArray();
        rv.reverseArrayy(arr, size);

        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
