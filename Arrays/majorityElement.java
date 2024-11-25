import java.util.Arrays;
public class majorityElement {
    public static void main(String[] args) {
        
        int arr[] = {2,2,1,1,1,2,2};

        int frq = 0;

    // Brute Force Time:O(n^2)
        // for(int val : arr){
        //     for (int ele : arr) {
        //         if (ele == val) {
        //             frq++;
        //         }
        //     }
        //     if(frq > (arr.length/2)){
        //         System.out.println( val + " has majority elements of " + frq);
        //         return;
        //     }
        //     frq=0;  
        // }

    // Optimized Approach Time:O(nlogn + n) = O(nlogn)
        // int i = 1;
        // int ans = arr[0];
        // Arrays.sort(arr); // Time: O(nlogn)
        // System.out.println(Arrays.toString(arr));
        // while(i < arr.length){            

        //     if(frq > (arr.length/2)){
        //         System.out.println( ans + " has majority elements of " + frq);
        //         return;
        //     }

        //     if(arr[i] == arr[i-1]){
        //         frq++;
                
        //     }
        //     else{
        //         frq = 0;
        //         ans = arr[i];
        //     }
        // }


    // Moore's Voting Algo which define that majority element always has its presence for tha size/2 in an array
    // so even if other elements will try to decrease it it still remains at the end 
    // and it will the ans
    // Time:O(n)
        int ans = 0;
        for (int i=0; i<arr.length; i++) {

            if (frq == 0) {
                ans = arr[i];
            }

            if(ans == arr[i]){
                frq++;
            }else{
                frq--;
            }

        }
        System.out.println( ans + " is the majority element");

    }
}
