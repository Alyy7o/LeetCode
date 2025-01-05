
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ChocolateDiff {

    public static int minPacket(ArrayList<Integer> arr, int m) { // O(nlogn)

        //slidng window
        Collections.sort(arr);
        int str = 0, end = m - 1;
        int minimum = Integer.MAX_VALUE;

        // O(n^2)
        // while (end < arr.size()) {
        //     int minDiff;
        //     int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        //     for (int i = str; i <= end; i++) { // for minimum
        //         min = Math.min(arr.get(i), min);
        //     }
        //     for (int i = str; i <= end; i++) { // for maximum
        //         max = Math.max(arr.get(i), max);
        //     }

        //     minDiff = max - min;
        //     minimum = Math.min(minDiff, minimum);
        //     str++;
        //     end++;
        // }

        // O(n)
        while(end < arr.size()){
            minimum = Math.min(minimum, arr.get(end) - arr.get(str));
            str++;
            end++;
        }
        return minimum;
    

    }
    public static void main(String[] args) {
        // int arr[] = {7, 3, 2, 4, 9, 12, 56};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 3, 2, 4, 9, 12, 56));
        int m = 3;
        System.out.println(minPacket(arr, m));
 
   }
}