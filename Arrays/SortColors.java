import java.util.Arrays;

public class SortColors {

    public int[] swap(int arr[], int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;

        return arr;
    }

    // Optimized Approach
    // public int[] sort(int arr[]){ //O(n)
    //     int count0 = 0, count1 = 0, count2 = 0;

    //     for(int i=0; i<arr.length-1; i++){
    //         if(arr[i] == 0) count0++;
    //         else if(arr[i] == 1) count1++;
    //         else if(arr[i] == 2) count2++;
    //     }

    //     int idx=0;
    //     for(int i=0; i<=count0; i++){
    //         arr[idx++] = 0;
    //     }
    //     for(int i=0; i<count1; i++){
    //         arr[idx++] = 1;
    //     }
    //     for(int i=0; i<count2; i++){
    //         arr[idx++] = 2;
    //     }

    //     return arr;
    // }

    // Optimal Approach with zero passing
    // By Dutch-National Flag Algo
    public int[] sort(int arr[]){ // O(n)
        
        int low = 0, mid = 0, high = arr.length-1;

        while (mid <= high) {
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                swap(arr, high, mid);
                high--;
            }
        }

        return arr;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        
        SortColors sortColors = new SortColors();
        System.out.println(Arrays.toString(sortColors.sort(arr)));
    }
}
